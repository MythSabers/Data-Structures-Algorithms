import LinkedList.DoubleLinkedList;

public class DeleteLastNodeDLL {

    public static void main(String[] args) {
        DoubleLinkedList head = new DoubleLinkedList(10);
        DoubleLinkedList first = new DoubleLinkedList(20);
        DoubleLinkedList second = new DoubleLinkedList(30);

        head.next = first;
        first.prev = head;
        first.next = second;
        second.prev = first;

        printDoubleLinkedList(head);
        head = deleteLastHead(head);
        printDoubleLinkedList(head);
    }

    public static void printDoubleLinkedList(DoubleLinkedList head) {
        DoubleLinkedList curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static DoubleLinkedList deleteLastHead(DoubleLinkedList head) {
        if (head == null || head.next == null)
            return null;
        DoubleLinkedList curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr = curr.prev;
        curr.next = null;
        return head;
    }
}

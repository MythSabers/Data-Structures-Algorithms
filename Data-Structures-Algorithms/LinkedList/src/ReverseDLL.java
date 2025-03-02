import LinkedList.DoubleLinkedList;

public class ReverseDLL {
    public static void main(String[] args) {
        DoubleLinkedList head = new DoubleLinkedList(10);
        DoubleLinkedList first = new DoubleLinkedList(20);
        DoubleLinkedList second = new DoubleLinkedList(30);

        head.next = first;
        first.prev = head;

        first.next = second;
        second.prev = first;

        printDoubleLinkedList(head);
        head = reverse(head);
        printDoubleLinkedList(head);
    }

    public static DoubleLinkedList reverse(DoubleLinkedList head) {
        DoubleLinkedList curr = head;
        DoubleLinkedList temp = null ;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null)
            head = temp.prev;
        return head;
    }

    public static void printDoubleLinkedList(DoubleLinkedList head) {
        DoubleLinkedList curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

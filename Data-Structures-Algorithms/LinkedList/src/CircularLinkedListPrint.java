import LinkedList.CircularLinkedList;

public class CircularLinkedListPrint {
    public static void main(String[] args) {
        CircularLinkedList head = new CircularLinkedList(10);
        CircularLinkedList first = new CircularLinkedList(20);
        CircularLinkedList second = new CircularLinkedList(30);

        head.next = first;
        first.next = second;
        second.next = head;

        head = insertBegin(head, 1);
        head = insertEnd(head, 1);
        printList(head);
        head = deleteHead(head);
        head = deleteKthPosition(head, 2);
        printList(head);

    }

    public static void printList(CircularLinkedList head) {
        if (head == null)
            return;
        CircularLinkedList curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static CircularLinkedList insertBegin(CircularLinkedList head, int data) {
        CircularLinkedList temp = new CircularLinkedList(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return head;
        }
    }

    public static CircularLinkedList insertEnd(CircularLinkedList head, int x) {
        CircularLinkedList temp = new CircularLinkedList(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return temp;
    }

    public static CircularLinkedList deleteHead(CircularLinkedList head) {
        if (head == null)
            return null;
        if (head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static CircularLinkedList deleteKthPosition(CircularLinkedList head, int k) {
        if (head == null)
            return head;
        if (k == 1)
            return deleteHead(head);
        CircularLinkedList curr = head;
        for (int i = 0; i < k - 2; i++)
            curr = curr.next;
        curr.next = curr.next.next;
        return head;
    }
}

public class MergeTwoSortedList {
    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        Node b = new Node(5);
        b.next = new Node(35);
        printList(sortedMerge(a, b));
    }

    static void printList(Node head) {
        for (Node curr = head; curr != null; curr = curr.next)
            System.out.print(curr.data + " ");
        System.out.println();
    }

    static Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node head = null, tail = null;
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }

        if (a == null)
            tail.next = b;
        else
            tail.next = a;
        return head;
    }
}

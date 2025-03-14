class IntersectionLinkedList{
    Node head1, head2;

    int getNode() {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;
        if (c1 > c2) {
            d = c1 - c2;
            return getIntersectionNode(d, head1, head2);
        } else {
            d = c2 - c1;
            return getIntersectionNode(d, head1, head2);
        }
    }

    int getIntersectionNode(int d, Node head1, Node head2) {
        int i;
        Node current1 = head1;
        Node current2 = head2;
        for (i = 0; i < d; i++) {
            if (current1 == null)
                return -1;
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data)
                return current1.data;
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
    }


    int getCount(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

}

public class IntersectionPointOfTwoLinkedList {
    public static void main(String[] args) {
        IntersectionLinkedList list = new IntersectionLinkedList();

        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);

        System.out.println(list.getNode());
    }
}

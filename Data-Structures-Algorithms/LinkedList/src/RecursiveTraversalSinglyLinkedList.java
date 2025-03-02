import LinkedList.Node;

public class RecursiveTraversalSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        print(head);
    }

    public static void print(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        print(head.next);
    }
}

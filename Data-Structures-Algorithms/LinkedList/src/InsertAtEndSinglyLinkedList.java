import LinkedList.Node;

public class InsertAtEndSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        Node node = insertEnd(head, 200);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return newNode;
    }
}

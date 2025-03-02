import LinkedList.Node;

public class InsertAtBegin {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = insertBegin(head, 2);

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node insertBegin(Node head, int data) {
        if (head == null)
            return new Node(data);
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }
}

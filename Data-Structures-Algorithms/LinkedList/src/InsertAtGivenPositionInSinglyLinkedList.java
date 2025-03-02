import LinkedList.Node;

public class InsertAtGivenPositionInSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        Node node = insertPos(head, 1, 200);

        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static Node insertPos(Node head, int pos, int data) {
        Node newNode = new Node(data);
        if (head == null && pos == 1)
            return newNode;
        Node temp = head;
        int i = 1;
        while (temp.next != null) {
            if (i == pos) {
                break;
            }
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}

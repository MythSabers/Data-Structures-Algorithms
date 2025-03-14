public class DeleteNodeWithOnlyPointer {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        Node ptr=new Node(30);
        head.next.next=ptr;
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(25);
        printlist(head);
        deleteNode(ptr);
        printlist(head);
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void deleteNode(Node node) {
        Node temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
    }
}

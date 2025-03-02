
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchInALinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printList(head);
        System.out.println("Position of element in Linked List: "+search(head,20));
    }

    static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x)
                return pos;
            pos++;
            curr = curr.next;
        }
        return -1;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

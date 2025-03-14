
class Node_List {
    int data;
    Node_List next, random;

    Node_List(int x) {
        this.data = x;
        next = random = null;
    }
}

class List {
    void printList(Node_List head) {
        for (Node_List curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
        System.out.println();
    }

    Node_List clone(Node_List head) {
        Node_List next, temp;
        for (Node_List curr = head; curr != null;) {
            next = curr.next;
            curr.next = new Node_List(curr.data);
            curr.next.next = next;
            curr = next;
        }

        for (Node_List curr = head; curr != null; curr = curr.next.next)
            curr.next.random = (curr.random != null) ? (curr.random.next) : null;

        Node_List original = head, copy = head.next;
        temp = copy;

        while (original != null && copy != null) {
            original.next = original.next != null ? original.next.next : original.next;
            copy.next = copy.next != null ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }

        return temp;
    }
}

public class CloneLinkedListWIthRandomPointer {

    public static void main(String[] args) {
        Node_List head = new Node_List(10);
        head.next = new Node_List(5);
        head.next.next = new Node_List(20);
        head.next.next.next = new Node_List(15);
        head.next.next.next.next = new Node_List(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        List list = new List();

        System.out.print( "Original list : \n");
        list.printList(head);

        System.out.print( "\nCloned list : \n");
        Node_List cloned_list = list.clone(head);
        list.printList(cloned_list);
    }
}

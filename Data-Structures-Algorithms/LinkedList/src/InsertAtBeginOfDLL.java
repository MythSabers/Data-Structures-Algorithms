import LinkedList.DoubleLinkedList;

public class InsertAtBeginOfDLL {

    public static void main(String[] args) {
        DoubleLinkedList head = null;
        head = insertBegin(head, 20);
        head = insertBegin(head, 30);
        head = insertBegin(head, 40);
        head = insertBegin(head, 50);
        head = insertEnd(head, 60);
        printDoubleLinkedList(head);
    }

    public static void printDoubleLinkedList(DoubleLinkedList head) {
        DoubleLinkedList curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static DoubleLinkedList insertBegin(DoubleLinkedList head, int data) {
        DoubleLinkedList temp = new DoubleLinkedList(data);
        temp.next = head;
        if (head != null)
            head.prev = temp;
        return temp;
    }

    static DoubleLinkedList insertEnd(DoubleLinkedList head,int data){
        DoubleLinkedList temp=new DoubleLinkedList(data);
        if(head==null)
            return temp;
        DoubleLinkedList curr=head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
}

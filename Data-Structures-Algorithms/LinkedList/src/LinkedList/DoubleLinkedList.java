package LinkedList;

public class DoubleLinkedList {
    public int data;
    public DoubleLinkedList prev;
    public DoubleLinkedList next;

    public DoubleLinkedList(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

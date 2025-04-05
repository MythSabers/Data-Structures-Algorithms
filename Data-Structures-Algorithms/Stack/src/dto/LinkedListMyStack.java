package dto;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListMyStack {
    Node head;
    int size;
    LinkedListMyStack() {
        head =null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null)
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int peek() {
        if (head == null)
            return Integer.MAX_VALUE;
        return head.data;
    }

}

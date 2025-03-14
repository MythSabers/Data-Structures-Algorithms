
class nodeList {
    int val;
    nodeList next;
    nodeList(int val) {
        this.val = val;
        this.next = null;
    }

    nodeList(int val, nodeList prevNode) {
        this.val = val;
        prevNode.next = this;
    }
}

class LinkedList {
    void sortedInsert(nodeList head, nodeList newNode) {
        nodeList curr;
        if (head == null || head.val >= newNode.val) {
            newNode.next = head;
            head = newNode;
        } else {
            curr = head;
            while (curr.next != null && curr.next.val < newNode.val) {
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    void printNodeList(nodeList head) {
        nodeList curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

public class SortedInsert{
    public static void main(String[] args) {
        nodeList head = new nodeList(1);
        nodeList first = new nodeList(2, head);
        nodeList second = new nodeList(3, first);
        nodeList third = new nodeList(4, second);

        LinkedList list = new LinkedList();
        list.sortedInsert(head, new nodeList(2));
        list.printNodeList(head);
    }
}
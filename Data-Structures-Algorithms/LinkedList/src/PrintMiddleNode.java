


public class PrintMiddleNode {
    public static void main(String[] args) {
        nodeList head = new nodeList(1);
        nodeList first = new nodeList(2, head);
        nodeList second = new nodeList(3, first);
        nodeList third = new nodeList(4, second);

        printMiddleElements(head);
    }

    public static void printMiddleElements(nodeList head) {
        if (head == null)
            return;

        nodeList slow = head;
        nodeList fast = head;
        // move 2 points ahead in fast and 1 point in slow

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println(slow.val);
    }
}

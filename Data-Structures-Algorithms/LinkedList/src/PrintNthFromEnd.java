public class PrintNthFromEnd {
    public static void main(String[] args) {
        nodeList head = new nodeList(1);
        nodeList first = new nodeList(2, head);
        nodeList second = new nodeList(3, first);
        nodeList third = new nodeList(4, second);

        printNthNodeFromEnd(head, 2);
    }

    public static void printNthNodeFromEnd(nodeList head, int n) {
        if (head == null)
            return;
        nodeList first = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return;
            first = first.next;
        }

        nodeList second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(second.val);
    }
}

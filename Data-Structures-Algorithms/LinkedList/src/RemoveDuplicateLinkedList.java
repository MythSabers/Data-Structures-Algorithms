public class RemoveDuplicateLinkedList {

    public static void main(String[] args) {
        nodeList head = new nodeList(10);
        nodeList first = new nodeList(20, head);
        nodeList second = new nodeList(20, first);
        nodeList third = new nodeList(40, second);

        removeDuplicates(head);
        printList(head);
    }

    public static void printList(nodeList head) {
        nodeList curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void removeDuplicates(nodeList head) {
        nodeList curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
    }
}

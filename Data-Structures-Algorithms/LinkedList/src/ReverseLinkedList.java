public class ReverseLinkedList {
    public static void main(String[] args) {
        nodeList head = new nodeList(10);
        nodeList first = new nodeList(20, head);
        nodeList second = new nodeList(30, first);

        head = reverseLinkedList(head);

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

    public static nodeList reverseLinkedList(nodeList head) {
        if (head == null || head.next == null)
            return head;


        nodeList prev = null;
        nodeList curr = head;

        while (curr != null) {
            nodeList temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

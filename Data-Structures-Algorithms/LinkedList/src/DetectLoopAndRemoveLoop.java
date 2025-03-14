public class DetectLoopAndRemoveLoop {
    public static void main(String[] args) {
        nodeList head=new nodeList(15);
        head.next=new nodeList(10);
        head.next.next=new nodeList(12);
        head.next.next.next=new nodeList(20);
        head.next.next.next.next=head.next;

        // printList(head);
        isLoop_FloydCycleDetection_And_Remove(head);
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

    public static void isLoop_FloydCycleDetection_And_Remove(nodeList head) {
        nodeList slow = head;
        nodeList fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                break;
        }
        if (slow != fast)
            return;
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
    }
}

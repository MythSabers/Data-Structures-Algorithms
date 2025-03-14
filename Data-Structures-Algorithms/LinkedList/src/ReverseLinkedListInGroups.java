public class ReverseLinkedListInGroups {

    public static void main(String[] args) {
        nodeList head = new nodeList(10);
        nodeList first = new nodeList(20, head);
        nodeList second = new nodeList(30, first);
        nodeList third = new nodeList(40, second);

        head = reverseLinkedListInKGroups(head, 2);
        printList(head);
    }

    public static nodeList reverseLinkedListInKGroups(nodeList head, int k) {
        nodeList curr = head, prevFirst = null;
        boolean isFirstPass = true;
        while (curr != null) {
            nodeList first = curr, prev = null;
            int count = 0;
            while (curr != null && count < k) {
                nodeList next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
                count++;
            }

            if (isFirstPass) {
                head = prev;
                isFirstPass = false;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }




    public static void printList(nodeList head) {
        nodeList curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

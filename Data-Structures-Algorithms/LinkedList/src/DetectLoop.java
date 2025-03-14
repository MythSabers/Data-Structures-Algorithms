import java.util.HashSet;

public class DetectLoop {
    public static void main(String[] args) {
        nodeList head=new nodeList(15);
        head.next=new nodeList(10);
        head.next.next=new nodeList(12);
        head.next.next.next=new nodeList(20);
        head.next.next.next.next=head.next;


        if (isLoop_FloydCycleDetection(head))
            System.out.println("Floyd Algorithm Detection found");
        else
            System.out.println("Floyd Algorithm Detection Not found");

        if (isLoop_HashingMethod(head))
            System.out.println("Hashing Algorithm Detection found");
        else
            System.out.println("Hashing Algorithm Detection Not Found");
    }

    public static boolean isLoop_FloydCycleDetection(nodeList head) {
        nodeList slow = head;
        nodeList fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public static boolean isLoop_HashingMethod(nodeList head) {
        HashSet<nodeList> set = new HashSet<>();
        if (head == null)
            return false;
        nodeList curr = head;
        while (curr != null) {
            if (!set.add(curr))
                return true;
            curr = curr.next;
        }
        return false;
    }
}

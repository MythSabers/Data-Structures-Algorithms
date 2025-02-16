import java.util.HashSet;

public class PairWithGivenSumInUnsortedArray {

    public static void main(String[] args) {
        int[] arr = {3,4,8,7,6,1};
        int x = 14;

        pairWithSumX(arr, x);
    }

    public static void pairWithSumX(int[] arr, int x) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(x - i)) {
                System.out.println(1);
                break;
            }
            hs.add(i);
        }
    }
}

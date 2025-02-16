import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr = {5,3,9,-4,-6,7, -1};

        System.out.println(subArrayWithZeroSum(arr));
    }

    public static boolean subArrayWithZeroSum(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int prefixSum = 0;
        hs.add(0);
        for (int i : arr) {
            prefixSum += i;
            if (hs.contains(prefixSum))
                return true;
            hs.add(prefixSum);
        }
        return false;
    }
}

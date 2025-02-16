import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 13, 3, -1};
        int sum= 22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));
    }

    public static boolean isSum(int[] arr, int n, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;

        for (int i : arr) {
            preSum += i;
            if (preSum == sum)
                return true;
            if (set.contains(preSum - sum))
                return true;
            set.add(preSum);
        }

        return false;
    }
}

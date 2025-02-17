import java.util.HashMap;

public class LongestCommonSubArrayBetweenTwoArray {

    public static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        // find the difference between the two array and store
        // in auxiliary array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = arr1[i] - arr2[i];

        // Creates an empty hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int max_len = 0;

        // traverse through the given array
        for (int i = 0; i < n; i++) {
            // add current element to sum
            sum += arr[i];

            // to handle sum = 0 at last index;
            if (sum == 0)
                max_len = i + 1;

            // if this sum is seen before
            // then update max_len if required
            if (hm.containsKey(sum))
                max_len = Math.max(max_len, i - hm.get(sum));
            else
                hm.put(sum, i);
        }

        return max_len;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n = arr1.length;
        System.out.println(longestCommonSum(arr1, arr2, n));
    }
}

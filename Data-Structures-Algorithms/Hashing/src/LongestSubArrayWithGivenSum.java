import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, -4, -4, 9, -1, 2};
        int n = arr.length;
        int sum = 0;

        System.out.println(largestSubarrayWithSum(arr, n, sum));
    }

    public static int largestSubarrayWithSum(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {
            // accumulate sum
            sum += arr[i];

            // when subarray starts from index 0
            if (sum == k)
                maxLen = i + 1;

            // make an entry for sum if it is not present in map
            if (!map.containsKey(sum))
                map.put(sum, i);

            // check if sum - k is present in map or not
            if (map.containsKey(sum - k)) {
                // update the maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }
        return maxLen;
    }
}

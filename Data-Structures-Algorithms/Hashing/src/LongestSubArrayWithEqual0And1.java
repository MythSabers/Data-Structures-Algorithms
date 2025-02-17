import java.util.HashMap;

public class LongestSubArrayWithEqual0And1 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;

        System.out.println(largestZeroSubArray(arr, len));
    }

    public static int largestZeroSubArray(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        // invert the 0's to -1
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0 ? -1 : 1);

        // traverse through the given array
        for (int i = 0; i < n; i++) {

            // add current element to sum
            sum += arr[i];

            // To handle sum = 0 at last index
            if (sum == 0)
                maxLen = i + 1;


            // if this sum is seen before
            // then update the max len if required
            if (hm.containsKey(sum + n)) {
                // check if current i - current sum is greater than previous stored
                if (maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);
            } else {
                // else put this sum in map
                hm.put(sum + n, i);
            }
        }

        System.out.println(hm);

        return maxLen;
    }
}

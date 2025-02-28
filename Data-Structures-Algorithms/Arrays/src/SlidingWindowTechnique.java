public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;

        System.out.println(maxSum(arr, arr.length, k));
    }

    public static int maxSum(int[] arr, int n, int k) {
        int curr_sum = 0;
        for (int i = 0; i < k; i++)
            curr_sum += arr[i];

        int max_sum = curr_sum;

        for (int i = k; i < n; i++) {
            curr_sum += (arr[i] - arr[i - k]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}

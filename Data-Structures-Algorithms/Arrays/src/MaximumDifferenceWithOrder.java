public class MaximumDifferenceWithOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 90, 10, 110};
        System.out.println(maxDiff(arr));
    }

    public static int maxDiff(int[] arr) {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            max_diff = Math.max(arr[i] - min_element, max_diff);
            min_element = Math.min(arr[i], min_element);
        }
        return max_diff;
    }
}

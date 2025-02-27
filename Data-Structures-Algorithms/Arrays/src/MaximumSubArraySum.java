public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        subArrayWithMaxSum(arr);
    }

    public static void subArrayWithMaxSum(int[] arr) {
        int endIndex = 0;
        int currMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], arr[i] + currMax);
            if (currMax > globalMax) {
                globalMax = currMax;
                endIndex = i;
            }
        }

        int startIndex = endIndex;
        while (startIndex >= 0) {
            globalMax -= arr[startIndex];
            if (globalMax == 0)
                break;
            startIndex--;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

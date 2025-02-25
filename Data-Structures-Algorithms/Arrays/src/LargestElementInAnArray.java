public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4};
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr) {
        int max = 0;
        for (int i : arr)
            max = Math.max(i, max);
        return max;
    }
}

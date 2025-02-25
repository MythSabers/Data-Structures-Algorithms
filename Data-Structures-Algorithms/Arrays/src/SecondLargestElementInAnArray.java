public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargestElement(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i;
            }
        }

        return second;
    }
}

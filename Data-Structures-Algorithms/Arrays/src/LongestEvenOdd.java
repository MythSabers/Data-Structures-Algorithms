public class LongestEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 7, 2, 9, 4};
        System.out.println(maxEvenOdd(arr, arr.length));

    }

    public static int maxEvenOdd(int[] arr, int n) {
        if (n == 0)
            return 0;

        int maxLength = 0;

        int prevOdd = arr[0] % 2;
        int curLength = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] % 2 != prevOdd)
                curLength++;
            else
                curLength = 1;


            if (curLength > maxLength)
                maxLength = curLength;

            prevOdd = arr[i] % 2;
        }

        return maxLength;
    }
}

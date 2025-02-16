public class SpiralTraversal {

    public static void printSpiral(int[][] arr, int row, int col) {
        int top = 0;
        int left = 0;
        int bottom = row - 1;
        int right = col - 1;

        while (top <= bottom && left <= right) {

            // top elements
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            // right elements
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            // bottom elements
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            // left elements
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }


        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(arr, arr.length, arr[0].length);
    }
}

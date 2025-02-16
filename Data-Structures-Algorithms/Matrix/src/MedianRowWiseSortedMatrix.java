import java.util.Arrays;

public class MedianRowWiseSortedMatrix {

    public static int matMedian(int[][] mat, int row, int col) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][col - 1]);
        }

        int medianPosition = (row * col + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2, midPosition = 0;
            for (int i = 0; i < row; i++) {
                int pos = Arrays.binarySearch(mat[i], mid) + 1;
                midPosition += Math.abs(pos);
            }
            if (midPosition < medianPosition)
                min = mid+1;
            else
                max = mid;
        }

        return min;
    }
    public static void main(String[] args) {
        System.out.println(5 ^ 3);
        int[][] mat = {{5,10,20,30,40}, {1,2,3,4,6}, {11,13,15,17,19}};
        int row = mat.length;
        int col = mat[0].length;

        System.out.println(matMedian(mat, row, col));
    }
}

public class SortedRowWiseSearch {

    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int x = 35;

        sortedRowWiseTraversal(mat, mat.length, mat[0].length, x);
    }
    public static void sortedRowWiseTraversal(int[][] mat, int row, int col, int x) {
        

        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            if (mat[i][j] == x) {
                System.out.println("[" + i + ", " + j + "]");
                return;
            } else if (mat[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("[-1, -1]");
    }
}

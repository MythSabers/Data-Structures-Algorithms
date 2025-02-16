public class BoundaryTraversal {

    public static void boundaryTraversal(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        // base cases
        if (row == 1) {
            for (int i = 0; i < col; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if (col == 1) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][0] + " ");
            }
        } else {

            // traverse top boundary
            for (int i = 0; i < col; i++)
                System.out.print(arr[0][i] + " ");

            //System.out.println();
            // traverse right boundary
            for (int i = 1; i < row; i++)
                System.out.print(arr[i][row - 1] + " ");

            //System.out.println();
            // traverse bottom boundary
            for (int i = col - 2; i >= 0; i--)
                System.out.print(arr[row - 1][i] + " ");

            // System.out.println();
            // traverse left boundary
            for (int i = row - 2; i > 0; i--)
                System.out.print(arr[i][0] + " ");

        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        boundaryTraversal(arr);
    }
}

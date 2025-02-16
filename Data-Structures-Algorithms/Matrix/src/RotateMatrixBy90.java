public class RotateMatrixBy90 {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateBy90(mat);

        print(mat);

    }

    public static void rotateBy90(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        // transpose the matrix;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

//        print(mat);

        // reverse each column
        for (int i = 0; i < col; i++) {
            int top = 0;
            int bottom = row - 1;

            while (top <= bottom) {
                int temp = mat[top][i];
                mat[top][i] = mat[bottom][i];
                mat[bottom][i] = temp;

                top++;
                bottom--;
            }
        }
    }

    public static void print(int[][] mat) {
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

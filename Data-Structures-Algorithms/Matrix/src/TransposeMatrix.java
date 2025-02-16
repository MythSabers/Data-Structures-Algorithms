import static java.util.Collections.swap;

public class TransposeMatrix {


    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        transPoseMatrix(mat);

        print(mat);
    }

    public static void transPoseMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        if (row != col)
            return;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

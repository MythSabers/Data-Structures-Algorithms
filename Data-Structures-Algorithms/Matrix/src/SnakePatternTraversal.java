public class SnakePatternTraversal {

    public static void snakeTraversal(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;


        if (row == 1) {
            for (int i = 0; i < row; i++)
                System.out.print(arr[0][i] + " ");
        } else if (col == 1) {
            for (int i = 0; i < col; i++)
                System.out.print(arr[i][0] + " ");
        }

        for (int i = 0; i < row; i++) {
            if (i % 2 == 1) {
                // if row number is even
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else if (i % 2 == 0) {
                // if row number is odd
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        snakeTraversal(mat);
    }
}

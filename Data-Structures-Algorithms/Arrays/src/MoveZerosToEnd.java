public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        int size = moveZerosToEnd(arr);
        print(arr, size);
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int moveZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        return count;
    }
}

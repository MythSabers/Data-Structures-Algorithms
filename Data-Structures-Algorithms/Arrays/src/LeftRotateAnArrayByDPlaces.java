public class LeftRotateAnArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        reversalMethod(arr, d);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void reversalMethod(int[] arr, int d) {
        int[] temp = new int[d];

        for (int i = 0; i < d; i++)
            temp[i] = arr[i];

        for (int i = d; i < arr.length; i++)
            arr[i - d] = arr[i];

        for (int i = 0; i < d; i++)
            arr[arr.length - d + i] = temp[i];

    }
    public static void naiveApproach(int[] arr, int d) {
        for (int i = 1; i <= d; i++) {
            lRotate(arr);
        }
    }

    public static void lRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}

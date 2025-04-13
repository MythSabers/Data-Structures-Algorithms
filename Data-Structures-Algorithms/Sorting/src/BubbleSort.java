public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};
        print(arr);

        bubbleSort(arr, arr.length);
        print(arr);
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j ++) {
                if (arr[j] > arr[ j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}

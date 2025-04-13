import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {50,20,40,60,10,30};
        print(arr);
        isSort(arr, arr.length);
        print(arr);
    }

    static void isSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void print(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}

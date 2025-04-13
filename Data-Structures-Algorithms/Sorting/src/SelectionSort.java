import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,2,1,0};
        print(arr);
        selectionSort(arr, arr.length);
        print(arr);
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minInd = i;
            for (int j = i; j < n; j++)  {
                if (arr[j] < arr[minInd])
                    minInd = j;
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    static void print(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}

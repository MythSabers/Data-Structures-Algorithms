import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,40,8,11,15,22,25};
//        int[] arr2 = {5,6,6,10,15};

//        print(arr1, arr2);
        mergeFromLowToHighIndex(arr1, 0, 8, 3);
        print(arr1);
    }

    static void merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else
                System.out.print(arr2[j++] + " ");
        }
        while (i < arr1.length)
            System.out.print(arr1[i++] + " ");
        while (j < arr2.length)
            System.out.print(arr2[j++] + " ");
    }

    static void mergeFromLowToHighIndex(int[] arr, int l, int h, int m) {

        int index = 0;
        int n1 = m - l + 1;
        int n2 = h - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[i + l];
        for (int i = 0; i < n2; i++)
            right[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }

    static void print(int[] arr1, int[] arr2) {
        Arrays.stream(arr1).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(arr2).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    static void print(int[] arr1) {
        Arrays.stream(arr1).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}

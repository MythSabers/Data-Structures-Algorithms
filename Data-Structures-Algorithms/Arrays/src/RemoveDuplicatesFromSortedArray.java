public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int size = removeDuplicates(arr);
        print(arr, size);
    }

    public static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static int removeDuplicates(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}

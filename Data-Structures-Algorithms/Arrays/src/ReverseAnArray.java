public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        reverseArray(arr);
        print(arr);
    }

    public static void reverseArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }


    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

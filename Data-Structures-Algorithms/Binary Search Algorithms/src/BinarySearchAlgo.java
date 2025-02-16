public class BinarySearchAlgo {

    // binary search iterative approach

    public static int binarySearchIterative(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x) {
                high = mid - 1;
            }

            if (arr[mid] < x) {
                low = mid + 1;
            }
        }

        return -1;
    }

    // binary search recursive approach

    public static int binarySearchRecursive(int[] arr, int x, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        else if (arr[mid] == x)
            return mid;
        else if (arr[mid] > x)
            return binarySearchRecursive(arr, x, low, mid - 1);
        else if (arr[mid] < x)
            return binarySearchRecursive(arr, x, mid + 1, high);
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 5};
        int x = 3;

        System.out.println(binarySearchIterative(arr, x));
        System.out.println(binarySearchRecursive(arr, x, 0, arr.length - 1));
    }
}
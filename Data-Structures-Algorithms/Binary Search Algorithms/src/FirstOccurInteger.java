public class FirstOccurInteger {

    // find the first index of element in an sorted array, using binary search
    public static int find(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x)
                high = mid - 1;

            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5};
        int x = 3;

        System.out.println(find(arr, x));
    }
}

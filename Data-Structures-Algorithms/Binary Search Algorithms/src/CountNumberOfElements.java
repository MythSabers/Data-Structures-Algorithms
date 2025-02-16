public class CountNumberOfElements {

    public static int findLastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid])
                low = mid + 1;
            else if (x < arr[mid])
                high = mid - 1;
            else {
                if (mid == arr.length - 1 || arr[mid + 1] != arr[mid])
                    return mid;
                else
                    low = mid + 1;
            }

        }
        return -1;
    }

    public static int findFirstOccurrence(int[] arr, int x) {
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

    public static int countOccurrence(int[] arr, int x) {
        int firstOccurrence = findFirstOccurrence(arr, x);
        if (firstOccurrence == -1)
            return 0;
        return findLastOccurrence(arr, x) - firstOccurrence + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 40, 40};
        int x = 20;

        System.out.println(countOccurrence(arr, x));
    }
}

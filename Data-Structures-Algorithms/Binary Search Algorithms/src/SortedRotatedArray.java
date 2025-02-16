import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SortedRotatedArray {

    // search the element in a sorted & rotated array
    public static int find(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
              if (x > arr[mid] && x <= arr[high])
                  low = mid + 1;
              else
                  high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 5, 8};
        int x = 6;

        System.out.println(find(arr, x));
    }
}

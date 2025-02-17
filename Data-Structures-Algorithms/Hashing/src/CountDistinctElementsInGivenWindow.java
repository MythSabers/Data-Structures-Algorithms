import java.util.HashMap;

public class CountDistinctElementsInGivenWindow {

    public static void main(String[] args) {
        int[] arr = {10, 10, 5, 3, 20, 5};
        int n = arr.length;
        int k = 4;

        printDistinct(arr, n, k);
    }

    public static void printDistinct(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        System.out.print(map.size() + " ");

        for (int i = k; i < n; i++) {
            map.put(arr[i - k], map.get(arr[i - k]) - 1);

            if (map.get(arr[i - k]) == 0)
                map.remove(arr[i - k]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.print(map.size() + " ");

        }
    }
}

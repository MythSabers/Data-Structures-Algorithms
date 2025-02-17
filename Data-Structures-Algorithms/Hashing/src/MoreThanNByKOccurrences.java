import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurrences {

    public static void main(String[] args) {
        int[] arr = {30, 10, 20, 20, 20, 10, 40, 30, 30};

        int n = arr.length;
        int k = 4;

        printNByKEfficient(arr, n, k);
    }

    // naive solution
    public static void printNByK(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr)
            hm.put(i, hm.getOrDefault(i, 0) + 1);

        hm.forEach((k1, v) -> {
            if (v > n / k) {
                System.out.print(k1 + " ");
            }
        });
    }

    public static void printNByKEfficient(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            } else if (hm.size() < k - 1) {
                hm.put(arr[i], 1);
            } else {
                for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
                    hm.put(x.getKey(), x.getValue() - 1);
                    if (x.getKey() == 0)
                        hm.remove(x.getKey(), x.getValue());
                }
            }
        }


        // iterate over map and count every key's frequencies in array
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            int count = 0;
            for (int i : arr)
                if (i == map.getKey())
                    count++;

            if (count > n / k)
                System.out.print(map.getKey() + " ");
        }
    }

}

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 2, 10, 13};;
        int n = arr.length;

        System.out.println(longestConsecutiveSubsequence(arr, n));
    }

    public static int longestConsecutiveSubsequence(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr)
            hs.add(i);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int curr = 1;
                while (hs.contains(curr + arr[i]))
                    curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}

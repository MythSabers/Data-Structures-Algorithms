import java.util.Arrays;

public class LeftMostFirstNonRepeatingCharacters {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepeating(s));
    }

    public static int nonRepeating(String s) {
        int[] fi = new int[256];
        Arrays.fill(fi, -1);

        for (int i = 0; i < s.length(); i++) {
            if (fi[s.charAt(i)] == -1)
                fi[s.charAt(i)] = i;
            else
                fi[s.charAt(i)] = -2;
        }

        int res = Integer.MAX_VALUE;
        for (int i : fi) {
            if (i >= 0)
                res = Math.min(res, i);
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}

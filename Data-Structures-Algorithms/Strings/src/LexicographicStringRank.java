public class LexicographicStringRank {

    public static final int CHAR = 256;
    public static void main(String[] args) {
        String s = "STRING";
        System.out.println(lexRank(s));
    }

    public static int lexRank(String s) {
        int[] count = new int[CHAR];
        int fact = factorial(s.length());
        int n = s.length();
        int res = 1;

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        // create prefix sum of count array
        for (int i = 1; i < CHAR; i++) {
            count[i] += count[i - 1];
        }


        // iterate over string from left to right and multiply prefix array of character
        // with factorial(possibilities)
        // decrement the right of string at index i with 1
        for (int i = 0; i < n; i++) {
            fact /= (n - i);
            res += (count[s.charAt(i) - 1] * fact);
            updateCountArray(count, s.charAt(i));
        }

        return res;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void updateCountArray(int[] a, char c) {
        for (int i = c; i < a.length; i++)
            a[i]--;
    }

    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}

public class LeftmostFirstRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcbc";
        System.out.println(findLeftmostFirstRepeatingCharacters(s));
    }

    public static int findLeftmostFirstRepeatingCharacters(String s) {
        int[] v = new int[256];
        for (char c : s.toCharArray()) {
            v[c]++;
        }

        for (int index = 0; index < s.length(); index++) {
            if (v[s.charAt(index)] > 1)
                return index;
        }

        return -1;
    }
}

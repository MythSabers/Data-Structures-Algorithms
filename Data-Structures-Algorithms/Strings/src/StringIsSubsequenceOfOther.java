public class StringIsSubsequenceOfOther {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "BA";

        boolean i = isSubSequence(s1, s2);
        System.out.println(i);
    }

    public static boolean isSubSequence(String s1, String s2) {
        int j = 0;
        int n = s1.length();
        int m = s2.length();
        for (int i = 0; i < n && j < m; i++) {
            if (s1.charAt(i) == s2.charAt(j))
                j++;
        }
        return j == m;
    }
}

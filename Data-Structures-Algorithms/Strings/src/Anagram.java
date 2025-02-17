public class Anagram {
    public static void main(String[] args) {
        String s1 = "abaac";
        String s2 = "aacaa";
        if (areAnagram(s1, s2))
            System.out.println("Two Strings are anagram of each other");
        else
            System.out.println("Two Strings are not anagram of each other");
    }

    public static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] arr = new int[256];
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }

        for (int i : arr)
            if (i != 0)
                return false;
        return true;
    }
}

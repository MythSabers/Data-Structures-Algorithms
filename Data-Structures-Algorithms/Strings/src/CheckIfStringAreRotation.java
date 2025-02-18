public class CheckIfStringAreRotation {
    public static void main(String[] args) {
        String s1 = "ABCC";
        String s2 = "CCA";

        System.out.println(areRotation(s1, s2));
    }

    public static boolean areRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return (s1 + s1).contains(s2);
    }
}

import java.util.LinkedList;
import java.util.List;

public class NaivePatternSearching {
    public static void main(String[] args) {
        String s = "ABABABCD";
        String p = "ABAB";

        System.out.println(naivePatternSearching(s, p));
        System.out.println(naivePatternSearching_Improved(s, p));
    }

    // this algorithm searches all the pattern in a given
    // might contains duplicate as well
    public static List<Integer> naivePatternSearching(String s, String p) {
        List<Integer> list = new LinkedList<>();
        int n = s.length();
        int m = p.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (p.charAt(j) != s.charAt(i + j))
                    break;
            }

            if (j == m)
                list.add(i);
        }
        return list;
    }

    // this algorithm search in only distinct
    public static List<Integer> naivePatternSearching_Improved(String s, String p) {
        List<Integer> list = new LinkedList<>();
        int n = s.length();
        int m = p.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (p.charAt(j) != s.charAt(i + j))
                    break;
            }

            if (j == m)
                list.add(i);
            else if (j == 0)
                i++;
            else
                i = i + j;
        }
        return list;
    }
}

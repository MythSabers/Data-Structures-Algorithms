public class KMPAlgorithm {
    public static void main(String[] args) {
        String txt = "BABABABABCABABCABAB";
        String pat = "ABABCABAB";
        KMP(txt, pat);
    }

    public static void KMP(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = computeLPS(pat);
        int i = 0, j = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Index: " + (i - j));
                j = lps[j - 1];
            } else {
                if (i < n && pat.charAt(j) != txt.charAt(i)) {
                    if (j != 0)
                        j = lps[j - 1];
                    else
                        i++;
                } else {
                    i++;
                }
            }
        }
    }

    public static int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int j = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}

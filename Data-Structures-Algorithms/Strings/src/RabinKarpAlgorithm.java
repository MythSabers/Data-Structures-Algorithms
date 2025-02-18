public class RabinKarpAlgorithm {
    static final int d = 256;
    static final int q = 101;

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        System.out.println("ALL INDEX NUMBERS WHERE PATTERN FOUND: ");
        RBSearch(pat, txt, pat.length(), txt.length());
    }

    public static void RBSearch(String pat, String txt, int M, int N) {
        // compute (d^(m-1))%q
        int h = 1;
        for (int i = 1; i < M; i++)
            h = (h * d) % q;

        // compute p and to
        int p = 0, t = 0;
        for (int i = 0; i < M; i++){
            p = (p * d + pat.charAt(i)) % q;
            t = (t * d + txt.charAt(i)) % q;
        }

        // iterate over string for pattern search
        for (int i = 0; i <= (N - M); i++) {
            // check for hit
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag)
                    System.out.print(i + " ");
            }

            if (i < N - M) {
                t = ((d * (t - txt.charAt(i) * h)) + txt.charAt(i + M)) % q;
                if (t < 0)
                    t = t + q;
            }
        }
    }
}

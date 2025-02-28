public class MaximumAppearingElement {
    public static int MAX = 1000000;
    public static void main(String[] args) {
        int[] L = {1, 5, 9, 13, 21};
        int[] R = {15, 8, 12, 20, 24};
        int n = L.length;
        System.out.println(maximumOccurredElement(L, R, n));
    }

    public static int maximumOccurredElement(int[] L, int[] R, int n) {
        int[] arr = new int[MAX];

        int maxi = -1;
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
            maxi = Math.max(maxi, R[i]);
        }

        int msum = arr[0];
        int ind = 0;
        for (int i = 1; i < maxi + 1; i++) {
            arr[i] += arr[i - 1];
            if (msum < arr[i]) {
                msum = arr[i];
                ind = i;
            }
        }
        return ind;
    }
}

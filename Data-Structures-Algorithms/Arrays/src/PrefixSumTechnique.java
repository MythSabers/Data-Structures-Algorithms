public class PrefixSumTechnique {
    static int[] pSum = new int[1000007];
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] += pSum[i - 1] + arr[i];
        }

        System.out.println(getSum(3, 5));
    }

    public static int getSum(int l, int r) {
        if (l == 0)
            return pSum[r];
        return pSum[r] - pSum[l-1];
    }
}

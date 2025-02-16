public class TwoPointerApproach {
    public static boolean isPair(int[] arr, int x) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            } else if (arr[i] + arr[j] > x) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 30};
        int x = 21;

        System.out.println(isPair(arr, x));
    }
}

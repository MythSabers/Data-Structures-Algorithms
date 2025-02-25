public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {20, 23, 23, 45, 78, 88};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }
}

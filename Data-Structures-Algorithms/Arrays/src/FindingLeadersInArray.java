public class FindingLeadersInArray {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }

    public static void printLeaders(int[] arr) {
        int max_so_far = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max_so_far) {
                max_so_far = arr[i];
                System.out.print(max_so_far + " ");
            }
        }
    }
}

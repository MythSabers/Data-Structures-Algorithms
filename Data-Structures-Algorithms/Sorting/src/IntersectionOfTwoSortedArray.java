import java.util.Arrays;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3,5,10,10,10,15,15,20};
        int[] arr2 = new int[]{5,10,10,15,30};

        print(arr1, arr2);
        intersect(arr1, arr2);
    }

    static void intersect(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int l1 = arr1.length;
        int l2 = arr2.length;

        while (i < l1 && j < l2) {
            if (i > 0 && arr1[i - 1] == arr1[i]) {
                i++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    static void print(int[] arr1, int[] arr2) {
        Arrays.stream(arr1).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(arr2).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}

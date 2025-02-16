import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoUnsortedArray {
    public static void intersectionOfTwoUnsortedArray(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr1)
            set.add(i);
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {20,40};

        intersectionOfTwoUnsortedArray(arr1, arr2);
    }
}

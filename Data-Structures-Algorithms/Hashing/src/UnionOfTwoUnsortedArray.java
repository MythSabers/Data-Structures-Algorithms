import java.util.HashSet;

public class UnionOfTwoUnsortedArray {
    public static void unionUnsortedArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1)
            set.add(i);
        for (int i : arr2)
            set.add(i);

        System.out.println(set);
        System.out.println(set.size());
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,3,4,9};

        unionUnsortedArray(arr1, arr2);
    }
}

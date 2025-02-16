import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void countDistinctElements(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr)
            set.add(i);

        set.forEach(System.out::println);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,3,0,1};
        countDistinctElements(arr);
    }
}

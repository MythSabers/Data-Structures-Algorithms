import java.util.HashMap;

public class FrequenciesOfArrayElements {

    public static void printFrequencyOfArrayElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,1,20,1,10,100};
        printFrequencyOfArrayElements(arr);
    }
}

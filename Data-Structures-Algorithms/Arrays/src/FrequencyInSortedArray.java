public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        frequencyOfSortedArray(arr);
    }

    public static void frequencyOfSortedArray(int[] arr) {
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i])
                freq++;
            else {
                System.out.println("Frequency " + arr[i - 1] + ", is: " + freq);
                freq = 1;
            }
        }
        System.out.println("Frequency " + arr[arr.length - 1] + ", is: " + freq);;
    }
}

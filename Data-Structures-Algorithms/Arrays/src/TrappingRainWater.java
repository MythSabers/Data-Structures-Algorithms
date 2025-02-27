public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        System.out.println(findWater(arr));
    }

    public static int findWater(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int water = 0;

        left[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
            left[i] = Math.max(arr[i], left[i - 1]);

        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            right[i] = Math.max(arr[i], right[i + 1]);

        for (int i = 0; i < arr.length; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }
}

package problems;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 30, 10, 5, 15};
        System.out.println(printPrevGreater(arr, arr.length));
    }

    public static String printPrevGreater(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            int pg = s.isEmpty() ? -1 : s.peek();
            builder.append(pg).append(" ");
            s.add(arr[i]);
        }
        return builder.toString();
    }
}

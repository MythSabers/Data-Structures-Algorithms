package problems;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {18,12,13,14,11,16};
        System.out.println(stockSpan(arr, arr.length));
    }

    public static String stockSpan(int[] arr, int n) {
        StringBuilder builder = new StringBuilder();
        Stack<Integer> stk = new Stack<>();
        stk.add(0);
        builder.append(1).append(" ");
        for (int i = 1; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i])
                stk.pop();

            int span = stk.isEmpty() ? i + 1: i - stk.peek();
            builder.append(span).append(" ");
            stk.push(i);
        }
        return builder.toString();
    }
}

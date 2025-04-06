package problems;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterProblem {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,9,18};

        System.out.println(nextGreater(arr, arr.length));
    }

    public static ArrayList<Integer> nextGreater(int[] arr, int n) {
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.add(arr[n - 1]);
        v.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            int ng = s.isEmpty() ? -1 : s.peek();
            v.add(ng);
            s.add(arr[i]);
        }

        return v;
    }
}

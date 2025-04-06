package problems;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,1,5,6};
        System.out.println("Maximum Area: " + getMaxAreaEfficientApproach(arr, arr.length));
    }

    // better approach for getting the histogram area
    public static int getMaxArea(int[] arr, int n) {
        int res = 0;
        int[] ps = new int[n];
        int[] ns = new int[n];
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for (int i = 0; i < n; i ++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
                s.pop();
            int pse = s.isEmpty() ? -1 : s.peek();
            ps[i] = pse;
            s.push(i);
        }

        while (!s.isEmpty())
            s.pop();

        s.push(n - 1);
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
                s.pop();
            int nse = s.isEmpty() ? n : s.peek();
            ns[i] = nse;
            s.add(i);
        }

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            curr += (i - ps[i] - 1) * arr[i];
            curr += (ns[i] - i - 1) * arr[i];
            res = Math.max(res, curr);
        }
        return res;
    }

    // effecient approach for getting the max area
    public static int getMaxAreaEfficientApproach(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int tp ;
        int curr;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                tp = s.peek();
                s.pop();
                curr = arr[tp] * (s.isEmpty() ? i : i - s.peek() - 1);
                res = Math.max(res, curr);
            }
            s.add(i);
        }

        while (!s.isEmpty()) {
            tp = s.peek();
            s.pop();
            curr = arr[tp] * (s.isEmpty() ? n : n - s.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;
    }
}

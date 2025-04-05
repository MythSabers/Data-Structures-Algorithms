package dto;

public class TwoStacks {
    int cap;
    int top1, top2;
    int[] arr;

    public TwoStacks(int n) {
        arr = new int[n];
        cap = n;
        top1 = -1;
        top2 = cap;
    }

    public void pushTo1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public void pushTo2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public int popTo1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }

    public int popTo2() {
        if (top2 <= cap) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }
}

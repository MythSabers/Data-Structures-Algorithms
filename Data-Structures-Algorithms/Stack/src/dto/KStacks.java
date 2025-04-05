package dto;

import java.util.Arrays;

public class KStacks {
    int[] arr;
    int[] top;
    int[] next;
    int cap, k;
    int freeTop;

    public KStacks(int k1, int n) {
        k = k1;
        cap = n;
        arr = new int[cap];
        top = new int[k];
        next = new int[cap];
        Arrays.fill(top, 0, k - 1, -1);
        freeTop = 0;
        for (int i = 0; i < cap - 1; i++)
            next[i] = i + 1;
        next[cap - 1] = -1;
    }

    public boolean isFull() {
        return freeTop == -1;
    }

    public boolean isEmpty(int sn) {
        return top[sn] == -1;
    }

    public void push(int x, int sn) {
        if (isFull()) {
            System.out.println("\nStack Overflow\n");
            return;
        }
        int i = freeTop;
        freeTop = next[i];
        next[i] = top[sn];
        top[sn] = i;
        arr[i] = x;
    }

    public int pop(int sn) {
        if (isEmpty(sn)) {
            System.out.println("\nStack Overflow\n");
            return Integer.MAX_VALUE;
        }

        int i = top[sn];
        top[sn] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return arr[i];
    }
}

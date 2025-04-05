package dto;

import java.util.ArrayList;

public class MyStack {

    ArrayList<Integer> arr = new ArrayList<>();

    void push (int x) {
        arr.add(x);
    }

    int pop() {
        int res = arr.get(arr.size() - 1);
        arr.remove(res);
        return res;
    }

    int size() {
        return arr.size();
    }

    boolean isEmpty() {
        return arr.size() == 0;
    }
}

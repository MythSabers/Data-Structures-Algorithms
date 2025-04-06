package dto;

import java.util.Objects;
import java.util.Stack;

public class StackImplCustom {
    Stack<Integer> ms;
    Stack<Integer> as;

    StackImplCustom() {
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x) {
        if (ms.isEmpty()) {
            ms.add(x);
            as.add(x);
            return;
        }
        ms.add(x);
        if (as.peek() >= ms.peek())
            as.add(x);
    }

    void pop() {
        if (Objects.equals(as.peek(), ms.peek()))
            as.pop();
        ms.pop();
    }

    int top() {
        return ms.peek();
    }

    int getMin() {
        return as.peek();
    }
}

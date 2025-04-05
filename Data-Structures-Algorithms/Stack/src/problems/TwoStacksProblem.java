package problems;

import dto.TwoStacks;

public class TwoStacksProblem {
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(5);
        ts.pushTo1(5);
        ts.pushTo2(10);
        ts.pushTo2(15);
        ts.pushTo1(11);
        ts.pushTo2(7);
        System.out.println("Popped element from stack1 is: " + ts.popTo1());
        ts.pushTo2(40);
        System.out.println("Popped element from stack2 is: " + ts.popTo2());
    }
}

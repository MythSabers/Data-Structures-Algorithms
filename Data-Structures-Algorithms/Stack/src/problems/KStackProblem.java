package problems;

import dto.KStacks;

public class KStackProblem {
    public static void main(String[] args) {
        int k = 3, n = 10;
        KStacks ks=new KStacks(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2) );
        System.out.println("Popped element from stack 1 is " + ks.pop(1) );
        System.out.println("Popped element from stack 0 is " + ks.pop(0) );
    }
}

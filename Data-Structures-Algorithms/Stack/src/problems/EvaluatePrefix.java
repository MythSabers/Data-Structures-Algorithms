package problems;

import java.util.Stack;

public class EvaluatePrefix {
    public static void main(String[] args) {
        String test_expression = "+9*26";
        System.out.println(evaluate(test_expression));
    }

    public static boolean isOperand(char c) {
        return Character.isDigit(c);
    }

    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            if (isOperand(exp.charAt(i))) {
                stack.push(exp.charAt(i) - '0');
            } else {
                int o1 = stack.pop();
                int o2 = stack.pop();

                switch (exp.charAt(i)) {
                    case '+' -> stack.push(o1 + o2);
                    case '-' -> stack.push(o1 - o2);
                    case '*' -> stack.push(o1 * o2);
                    case '/' -> stack.push(o1 / o2);
                }
            }
        }
        return stack.pop();
    }
}

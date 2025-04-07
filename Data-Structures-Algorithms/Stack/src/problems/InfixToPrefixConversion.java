package problems;

import java.util.Stack;

class Conversions {
    String infixToPrefix(String exp) {
        Stack<Character> operators = new Stack<>();
        Stack<String> operands = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c == '(')
                operators.push(c);
            else if (c == ')') {
                while (!operators.empty() && operators.peek() != '(') {
                    String op1 = operands.peek();
                    operands.pop();

                    String op2 = operands.peek();
                    operands.pop();

                    char op = operators.peek();
                    operators.pop();

                    String tmp = op + op2 + op1;
                    operands.push(tmp);
                }
                operators.pop();
            } else if(!isOperator(c)) {
                operands.push(String.valueOf(c));
            } else {
                while (!operators.isEmpty() && getPriority(c) <= getPriority(operators.peek())) {
                    String op1 = operands.peek();
                    operands.pop();

                    String op2 = operands.peek();
                    operands.pop();

                    char ch = operators.peek();
                    operators.pop();

                    String tmp = ch + op2 + op1;
                    operands.push(tmp);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            String op1 = operands.peek();
            operands.pop();

            String op2 = operands.peek();
            operands.pop();

            char op = operators.peek();
            operators.pop();

            String tmp = op + op2 + op1;
            operands.push(tmp);
        }

        return operands.peek();
    }

    private boolean isOperator(char c) {
        return !Character.isAlphabetic(c) && !Character.isDigit(c);
    }

    private int getPriority(char c) {
        if (c == '-' || c == '+')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '^')
            return 3;
        return 0;
    }
}
public class InfixToPrefixConversion {
    public static void main(String[] args) {
        String s = "(A-B/C)*(A/K-L)";
        Conversions c = new Conversions();
        System.out.println(c.infixToPrefix(s));
    }
}

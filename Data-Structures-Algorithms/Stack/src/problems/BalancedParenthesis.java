package problems;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "([])";
        char[] arr = s.toCharArray();
        System.out.println(isBalancedParenthesis(arr));
    }

    static boolean isBalancedParenthesis(char[] arr) {
        Stack<Character> stk = new Stack<>();
        for (char c : arr) {
            if (c == '{' || c == '[' || c == '(')
                stk.push(c);
            else {
                if (stk.isEmpty())
                    return false;
                char p = stk.peek();
                if ((p == '[' && c == ']') || (p == '{' && c == '}') || (p == '(' && c == ')'))
                    stk.pop();
                else
                    return false;
            }
        }
        return true;
    }
}

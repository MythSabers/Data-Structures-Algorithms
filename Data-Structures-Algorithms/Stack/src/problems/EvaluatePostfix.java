package problems;

class Evaluate {
    private int top;
    private final String[] array;

    public Evaluate(int capacity) {
        top = -1;
        array = new String[capacity];
    }

    public boolean isEmpty() {
        return  top == -1;
    }
    public String peek() {
        return array[top];
    }
    public String pop() {
        if (!isEmpty()) {
            top--;
            return array[top + 1];
        } else {
            return "$";
        }
    }

    public void push (String op) {
        top++;
        array[top] = op;
    }

    public int evaluatePostfix(String exp) {
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                push(String.valueOf(c));
            } else {
                String val1 = pop();
                String val2 = pop();
                int result;
                int intVal1 = Integer.parseInt(val1);
                int intVal2 = Integer.parseInt(val2);

                result = switch (c) {
                    case '+' -> intVal2 + intVal1;
                    case '-' -> intVal2 - intVal1;
                    case '*' -> intVal2 * intVal1;
                    case '/' -> intVal2 / intVal1;
                    default -> 0;
                };
                push(String.valueOf(result));
            }
        }
        return Integer.parseInt(pop());
    }
}
public class EvaluatePostfix {
    public static void main(String[] args) {
        String exp = "231*+9-";
        Evaluate obj = new Evaluate(exp.length());
        System.out.println("Postfix evaluation: " + obj.evaluatePostfix(exp));
    }
}

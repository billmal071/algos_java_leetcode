import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        List<String> operators = List.of("+", "-", "*", "/");
        for (String token : tokens) {
            if (operators.contains(token)) {
                int right = stack.pop();
                int left = stack.pop();
                switch (token) {
                    case "+" -> stack.push(left + right);
                    case "-" -> stack.push(left - right);
                    case "*" -> stack.push(left * right);
                    case "/" -> stack.push(left / right);
                    default -> System.out.println("Not an operator");
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        int result = 0;
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                }
                case "-" -> {
                    result = -stack.pop() + stack.pop();
                    stack.push(result);
                }
                case "*" -> {
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                }
                case "/" -> {
                    int divisor = stack.pop();
                    result = stack.pop() / divisor;
                    stack.push(result);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

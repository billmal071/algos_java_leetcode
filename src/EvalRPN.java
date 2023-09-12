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
                    case "+":
                        stack.push(left + right);
                        break;
                    case "-":
                        stack.push(left - right);
                        break;
                    case "*":
                        stack.push(left * right);
                        break;
                    case "/":
                        stack.push(left / right);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        int result = 0;
        for (String token : tokens) {
            if (token.equals("+")) {
                result = stack.pop() + stack.pop();
                stack.push(result);
            } else if (token.equals("-")) {
                result = -stack.pop() + stack.pop();
                stack.push(result);
            } else if (token.equals("*")) {
                result = stack.pop() * stack.pop();
                stack.push(result);
            } else if (token.equals("/")) {
                int divisor = stack.pop();
                result = stack.pop() / divisor;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

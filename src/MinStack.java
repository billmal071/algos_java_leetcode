import java.util.Stack;

public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {
        this.min = Math.min(val, min);
        this.stack.push(val);
    }

    public void pop() {
        if (min == this.stack.pop()) {
            min = this.stack.get(1);
        } else {
            this.stack.pop();
        }
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        min = this.stack.stream().min(Integer::compareTo).orElse(0);
        return min;
    }
}

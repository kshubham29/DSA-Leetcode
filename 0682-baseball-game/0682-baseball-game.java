import java.util.*;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("C")) stack.pop();
            else if (op.equals("D")) stack.push(2 * stack.peek());
            else if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            } else stack.push(Integer.parseInt(op));
        }
        int sum = 0;
        for (int s : stack) sum += s;
        return sum;
    }
}

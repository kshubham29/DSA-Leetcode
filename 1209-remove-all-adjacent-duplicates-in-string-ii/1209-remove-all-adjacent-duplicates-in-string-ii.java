import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
                if (stack.peek().count == k) stack.pop();
            } else {
                stack.push(new Pair(c, 1));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Pair p : stack) {
            for (int i = 0; i < p.count; i++) sb.append(p.ch);
        }
        return sb.toString();
    }
}

class Pair {
    char ch;
    int count;
    Pair(char c, int cnt) {
        ch = c;
        count = cnt;
    }
}

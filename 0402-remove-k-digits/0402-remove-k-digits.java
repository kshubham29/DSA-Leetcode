import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        // Edge case: remove all digits
        if (k == num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            // Remove digits that are bigger than current digit
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // If k still > 0, remove from end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result and remove leading zeros
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        // Remove leading zeros
        int index = 0;
        while (index < result.length() && result.charAt(index) == '0') {
            index++;
        }

        String ans = result.substring(index);

        return ans.isEmpty() ? "0" : ans;
    }
}

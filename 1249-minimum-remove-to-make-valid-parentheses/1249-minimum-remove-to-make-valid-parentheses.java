class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
                sb.append(c);
            } else if (c == ')') {
                if (balance == 0) continue;
                balance--;
                sb.append(c);
            } else {
                sb.append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int open = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && open < balance) {
                open++;
                continue;
            }
            result.append(c);
        }

        return result.reverse().toString();
    }
}

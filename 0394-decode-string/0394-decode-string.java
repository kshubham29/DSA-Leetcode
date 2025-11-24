class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {
            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(num);
            } else if (ch == '[') {
                resultStack.push(result);
                result = "";
                index++;
            } else if (ch == ']') {
                int repeat = counts.pop();
                StringBuilder sb = new StringBuilder(resultStack.pop());
                for (int i = 0; i < repeat; i++) sb.append(result);
                result = sb.toString();
                index++;
            } else {
                result += ch;
                index++;
            }
        }
        return result;
    }
}

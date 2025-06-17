public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        String numberRegex = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        return s.matches(numberRegex);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] testCases = {"2", "abc", "2e10", ".", "1a", "53.5e93"};
        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\" => " + sol.isNumber(test));
        }
    }
}

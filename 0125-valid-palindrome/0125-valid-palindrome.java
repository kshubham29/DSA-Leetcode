public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String filtered = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        return filtered.equals(reversed);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(sol.isPalindrome("race a car"));                     
        System.out.println(sol.isPalindrome(" "));                              
    }
}

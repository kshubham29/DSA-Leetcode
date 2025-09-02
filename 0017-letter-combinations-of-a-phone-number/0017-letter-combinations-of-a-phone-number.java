import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;

        Map<Character, String> map = getMap();
        solve(0, digits, "", ans, map);
        return ans;
    }

    private void solve(int index, String digits, String current, List<String> ans, Map<Character, String> map) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            solve(index + 1, digits, current + ch, ans, map);
        }
    }

    private Map<Character, String> getMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}

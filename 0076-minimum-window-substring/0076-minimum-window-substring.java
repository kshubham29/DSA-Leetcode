class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;
        int required = t.length(), left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (need[c] > 0) required--;
            need[c]--;
            right++;
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char d = s.charAt(left);
                need[d]++;
                if (need[d] > 0) required++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

class Solution {
    public String reverseWords(String s) {
        if (s == null || s.equals("")) {
            return s;
        }

        String ret = "";
        int i = 0;

        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            String w = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                w += s.charAt(i);
                i++;
            }

            if (!w.equals("")) {
                ret = w + " " + ret;
            }
        }

        if (ret.isEmpty()) {
            return "";
        }

        return ret.substring(0, ret.length() - 1);
    }
}

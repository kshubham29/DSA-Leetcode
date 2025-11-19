import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLength = words[i].length();
            int j = i + 1;

            while (j < words.length && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            int gaps = j - i - 1;

            if (j == words.length || gaps == 0) {
                StringBuilder sb = new StringBuilder(words[i]);
                for (int k = i + 1; k < j; k++) sb.append(" ").append(words[k]);
                while (sb.length() < maxWidth) sb.append(" ");
                result.add(sb.toString());
            } else {
                int totalSpaces = maxWidth - (lineLength - gaps);
                int spacePerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                StringBuilder sb = new StringBuilder();
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spacePerGap + (extraSpaces-- > 0 ? 1 : 0);
                        sb.append(" ".repeat(spaces));
                    }
                }
                result.add(sb.toString());
            }
            i = j;
        }

        return result;
    }
}

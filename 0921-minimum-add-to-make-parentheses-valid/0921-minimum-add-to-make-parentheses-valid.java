class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;     // count of unmatched '('
        int insertions = 0;  // number of insertions needed

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else { // ')'
                if (balance > 0) {
                    balance--;
                } else {
                    // need to insert '('
                    insertions++;
                }
            }
        }

        // remaining '(' need ')'
        return insertions + balance;
    }
}

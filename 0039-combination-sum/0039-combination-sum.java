import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current, List<List<Integer>> result) {

        // If target is 0 → valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If target goes negative → no need to proceed
        if (target < 0) return;

        // Try picking each candidate starting from 'index'
        for (int i = index; i < candidates.length; i++) {

            current.add(candidates[i]); // choose number

            // Since we can reuse same number, we pass i (not i+1)
            backtrack(candidates, target - candidates[i], i, current, result);

            current.remove(current.size() - 1); // backtrack
        }
    }
}

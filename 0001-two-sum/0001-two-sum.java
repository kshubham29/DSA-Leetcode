import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Edge case
        if (nums == null || nums.length == 0) return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what do I need?
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i }; // found!
            }
            map.put(nums[i], i); // store current number + index
        }
        return new int[]{}; // no solution found
    }
}
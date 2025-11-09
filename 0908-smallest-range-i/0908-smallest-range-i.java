class Solution {
    public int smallestRangeI(int[] nums, int k) {
        // Find minimum and maximum in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // We can reduce the difference by at most 2*k
        int diff = max - min - 2 * k;

        // If diff becomes negative, answer is 0
        return Math.max(0, diff);
    }
}

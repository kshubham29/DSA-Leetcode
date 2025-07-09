class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
    
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // Check if the difference between indices is <= k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the index of the current number
            map.put(nums[i], i);
        }

        return false;
    }
}

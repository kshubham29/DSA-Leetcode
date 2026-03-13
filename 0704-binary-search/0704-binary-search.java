class Solution {
    public int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // safe formula

            if (arr[mid] == target) return mid;        // found!
            else if (arr[mid] < target) left = mid + 1;  // go right
            else right = mid - 1;                        // go left
        }
        return -1; // not found
    }
}
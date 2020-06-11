/**
 * Leetcode 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
**/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        
        while (low < high) {
            int mid = (high + low) / 2;
            if (nums[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}
/*
 * Leetcode 53. Maximum Subarray
 * Given an integer array nums, find the contiguous subarray (containing at least one number), 
 * which has the largest sum and return its sum.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            maxSum = Math.max(maxSum, curr);
        }
        
        return maxSum;
    }
}
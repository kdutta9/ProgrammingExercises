/** 
 * Leetcode 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
**/

class Solution {
    public int[] runningSum(int[] nums) {
        int prevSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = prevSum + nums[i];
            prevSum = nums[i];
        }
        return nums;
    }
}
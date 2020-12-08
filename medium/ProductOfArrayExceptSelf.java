/*
 * Leetcode 238. Product of Array Except Self
 * Given an array nums of n integers where n > 1,  return an array output 
 * such that output[i] is equal to the product of all the elements of nums except nums[i].
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];
        int total_left = 1;
        int total_right = 1;
        
        for (int i = 0; i < nums.length; i++) {
            left[i] = total_left;
            total_left *= nums[i];
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            right[j] = total_right;
            total_right *= nums[j];
            output[j] = right[j] * left[j];
        }
        
        return output;
    }
}
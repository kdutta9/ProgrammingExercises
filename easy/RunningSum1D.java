/** 
 * Leetcode 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
**/

class Solution {
	/* If you can do this destructively,
	   then modify the input directly
	   by adding the prior element. */
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i+1] += nums[i];
        }
        
        return nums;
    }
    
    /* If you need to create a new array,
	   then track the running sum using a 
	   sum variable and setting each successive index
	   to the running sum at each iteration. */
    public int[] runningSumCreateNew(int[] nums) {
        int[] res = new int[nums.length];
        int runSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runSum += nums[i];
            res[i] = runSum;
        }
        
        return res;
    }
}
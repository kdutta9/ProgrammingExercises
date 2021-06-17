/**
 * Leetcode 1470. Shuffle the Array
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
**/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        
        /* Separately track result index and input index. */
        for (int i = 0, j = 0; i < nums.length; i=i+2, j++) {
            res[i] = nums[j];
            res[i+1] = nums[j+n];
        }
        
        return res;
    }
}
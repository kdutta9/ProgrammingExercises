/* Leetcode 1. Two Sum 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order. 
**/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        
        if (res == null) {
            System.out.println("No 2Sum possible.");
        } 
        return res;
    }
}
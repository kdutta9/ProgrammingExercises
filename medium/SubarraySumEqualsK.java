/*
 * Leetcode 560. Subarray Sum Equals K
 * Given an array of integers nums and an integer k, 
 * return the total number of continuous subarrays whose sum equals to k.
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        int temp = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            if (map.containsKey(temp - k)) {
                total += map.get(temp - k);
            }
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        
        return total;
    }
}
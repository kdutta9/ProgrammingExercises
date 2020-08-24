/**
 * Leetcode 1512. Number of Good Pairs
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
**/

import java.util.HashMap;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> instances = new HashMap<>();
        int res = 0;
        
        for (int i : nums) {
            if (instances.containsKey(i)) {
                instances.replace(i, instances.get(i) + 1);
            } else {
                instances.put(i, 1);
            }
        }
        
        for (int i : instances.values()) {
            res += comb(i);
        }
        
        return res;
    }
    
    public int comb(int n) {
        return (n * (n-1)) / 2;
    }
}
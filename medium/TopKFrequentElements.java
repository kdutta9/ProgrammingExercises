/*
 * Leetcode 347. Top K Frequent Elements
 * Given a non-empty array of integers, return the k most frequent elements.
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        
        HashMap<Integer, Integer> counts = new HashMap<>();
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> counts.get(n1) - counts.get(n2));
        int[] res = new int[k];
        
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int elem : counts.keySet()) {
            heap.add(elem);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }
        
        return res;
    }
}
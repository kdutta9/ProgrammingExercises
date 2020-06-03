/*
 * Leetcode 1029. Two City Scheduling
 * There are 2N people a company is planning to interview. 
 * The cost of flying the i-th person to city A is costs[i][0], 
 * and the cost of flying the i-th person to city B is costs[i][1].
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
*/

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int res = 0;
        final int N = costs.length / 2;
        
        ArrayList<Integer> savingsMap = new ArrayList<>();
        PriorityQueue<Integer> savings = new PriorityQueue<>();
        
        for (int i = 0; i < costs.length; i++) {
            int save = costs[i][0] - costs[i][1];
            savings.add(save);
            savingsMap.add(i, save);
        }
        
        for (int i = 0; i < costs.length; i++) {
            int val = savings.poll();
            int ind = savingsMap.indexOf(val);
            savingsMap.set(ind, null);
            if (i < N) {
                res += costs[ind][0];
            } else {
                res += costs[ind][1];
            }
        }
        
        return res;
    }
}
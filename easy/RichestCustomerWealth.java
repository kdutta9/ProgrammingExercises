/*
 * Leetcode 1672. Richest Customer Wealth
 * You are given an m x n integer grid accounts where accounts[i][j] 
 * is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
 * Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts. 
 * The richest customer is the customer that has the maximum wealth.
*/
class Solution {
    public int sumArray(int[] n) {
        int res = 0;
        for (int i = 0; i < n.length; i++) {
            res += n[i];
        }
        return res;
    }
    
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] arr : accounts) {
            int wealth = sumArray(arr);
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        
        return maxWealth;
    }
}
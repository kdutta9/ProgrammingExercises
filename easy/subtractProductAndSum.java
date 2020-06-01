/**
Leetcode 1281. Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
**/

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        
        while (n > 0) {
            int pop = n % 10;
            sum += pop;
            prod *= pop;
            n /= 10;
        }
        
        return prod - sum;
    }
}
/*
 * Leetcode 91. Decode Ways
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.
*/
class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if (s.charAt(0) == '0') {
            dp[1] = 0;
        } else {
            dp[1] = 1;
        }
        
        for (int i = 2; i < dp.length; i++) {
            if (s.charAt(i-1) != '0') {
                dp[i] += dp[i-1];
            }
            int a = Integer.valueOf(s.substring(i-2, i));
            if (a >= 10 && a <= 26) {
                dp[i] += dp[i-2];
            }
        }
        
        return dp[s.length()];
    }
}
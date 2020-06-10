/**
 * Leetcode 392. Is Subsequence
 * Given a string s and a string t, check if s is subsequence of t.
**/

class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int pointer = 0;
        
        for (char c : tArr) {
            if (pointer == sArr.length) {
                break;
            }
            if (c == sArr[pointer]) {
                pointer++;
            }
        }
        
        return pointer == sArr.length;
        
    }
}
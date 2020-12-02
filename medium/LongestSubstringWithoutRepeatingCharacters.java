/*
 * Leetcode 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest 
 * substring without repeating characters.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int res = 0;
        
        HashSet<Character> used = new HashSet<>();
        
        while (j < s.length()) {
            if (!used.contains(s.charAt(j))) {
                used.add(s.charAt(j));
                j++;
                res = Math.max(res, used.size());
            } else {
                used.remove(s.charAt(i));
                i++;
            }
        }
        
        return res;
    }
}
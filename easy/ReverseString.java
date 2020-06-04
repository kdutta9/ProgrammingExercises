/** 
 * Leetcode 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
**/

class Solution {
    public void reverseString(char[] s) {
        int forward = 0;
        int backward = s.length - 1;
        
        while (forward < backward) {
            char temp = s[forward];
            s[forward] = s[backward];
            s[backward] = temp;
            forward++;
            backward--;
        }
    }
}
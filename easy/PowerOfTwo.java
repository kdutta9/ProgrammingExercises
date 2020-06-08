/**
 * Leetcode 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.
**/

class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n&(n-1)) == 0) && n > 0;
    }
}

/**
Leetcode 807. Max Increase to Keep City Skyline

In a 2 dimensional array grid, each value grid[i][j] 
represents the height of a building located there. 
We are allowed to increase the height of any number of buildings, 
by any amount (the amounts can be different for different buildings). 
Height 0 is considered to be a building as well. 

At the end, the "skyline" when viewed from all four directions of the grid, 
i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. 
A city's skyline is the outer contour of the rectangles formed by all the buildings 
when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased? 
**/

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        int[] rowMaxes = new int[N];
        int[] colMaxes = new int[N];

        for (int r = 0; r < N; ++r)
            for (int c = 0; c < N; ++c) {
                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
                colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
        }

        int res = 0;
        for (int r = 0; r < N; ++r)
            for (int c = 0; c < N; ++c)
                res += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];

        return res;
}
}
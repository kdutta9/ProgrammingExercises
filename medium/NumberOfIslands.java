/* Leetcode 200. Number of Islands
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands 
 * horizontally or vertically. You may assume all four edges of the grid 
 * are all surrounded by water.
 */

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        
        if (grid == null || grid.length == 0) {
            return count;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        
        /* Use breadth first search to add islands. */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    Queue<Integer> land = new LinkedList<>();
                    land.add(cols * i + j);
                    count++;
                    grid[i][j] = 0;
            
                    while (!land.isEmpty()) {
                        int id = land.poll();
                        int r = id / cols;
                        int c = id % cols;
                        
                        
                        if (r + 1 < rows && grid[r+1][c] == '1') {
                            land.add(cols * (r+1) + c);
                            grid[r+1][c] = '0';
                        }
                        if (r - 1 >= 0 && grid[r-1][c] == '1') {
                            land.add(cols * (r-1) + c);
                            grid[r-1][c] = '0';
                        }
                        if (c + 1 < cols && grid[r][c+1] == '1') {
                            land.add(cols * r + c + 1);
                            grid[r][c+1] = '0';
                        }
                        if (c - 1 >= 0 && grid[r][c-1] == '1') {
                            land.add(cols * r + c - 1);
                            grid[r][c-1] = '0';
                        }
                    }
                }
            }
        }
        
        return count;
    }
}
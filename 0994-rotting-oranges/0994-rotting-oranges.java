class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        Queue<int[]> rottenpositions = new LinkedList<>();
        // Count fresh oranges and store rotten ones
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    rottenpositions.add(new int[]{i, j});
                }
            }
        }
        int time = 0;
        while (!rottenpositions.isEmpty() && fresh > 0) {
            int size = rottenpositions.size();
            while (size-- > 0) {
                int[] curr = rottenpositions.poll();
                int r = curr[0];
                int c = curr[1];
                // RIGHT
                if (c + 1 < n && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    fresh--;
                    rottenpositions.add(new int[]{r, c + 1});
                }
                // LEFT
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    fresh--;
                    rottenpositions.add(new int[]{r, c - 1});
                }
                // DOWN
                if (r + 1 < m && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    fresh--;
                    rottenpositions.add(new int[]{r + 1, c});
                }
                // UP
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    fresh--;
                    rottenpositions.add(new int[]{r - 1, c});
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}

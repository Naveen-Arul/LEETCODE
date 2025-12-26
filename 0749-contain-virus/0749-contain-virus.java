class Solution {
    public int containVirus(int[][] isInfected) {
        int m = isInfected.length; // get number of rows
        int n = isInfected[0].length; // get number of columns
        int totalWalls = 0; // total walls used

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}}; // directions for 4-way movement

        while (true) { // repeat until no more spread
            List<Set<Integer>> regions = new ArrayList<>(); // list of infected regions
            List<Set<Integer>> frontiers = new ArrayList<>(); // list of threatened cells
            List<Integer> walls = new ArrayList<>(); // list of walls needed

            boolean[][] visited = new boolean[m][n]; // track visited cells

            // find all regions
            for (int i = 0; i < m; ++i) { // loop rows
                for (int j = 0; j < n; ++j) { // loop columns
                    if (isInfected[i][j] == 1 && !visited[i][j]) { // if infected and not visited
                        Set<Integer> region = new HashSet<>(); // infected region
                        Set<Integer> frontier = new HashSet<>(); // threatened cells
                        int[] wall = new int[1]; // walls needed

                        dfs(isInfected, visited, i, j, region, frontier, wall, dirs, m, n); // find region

                        regions.add(region); // add region
                        frontiers.add(frontier); // add threatened cells
                        walls.add(wall[0]); // add wall count
                    }
                }
            }

            if (regions.isEmpty()) break; // no more regions

            int idx = 0; // index of region to contain
            for (int i = 1; i < frontiers.size(); ++i) { // find region with most threatened cells
                if (frontiers.get(i).size() > frontiers.get(idx).size()) idx = i; // update index
            }

            if (frontiers.get(idx).isEmpty()) break; // no more spread

            totalWalls += walls.get(idx); // add walls

            // contain the chosen region
            for (int pos : regions.get(idx)) {
                int x = pos / n; // get row
                int y = pos % n; // get column
                isInfected[x][y] = -1; // mark as contained
            }

            // let virus spread from other regions
            for (int i = 0; i < regions.size(); ++i) {
                if (i == idx) continue; // skip contained region
                for (int pos : frontiers.get(i)) {
                    int x = pos / n; // get row
                    int y = pos % n; // get column
                    isInfected[x][y] = 1; // infect cell
                }
            }
        }
        return totalWalls; // return total walls used
    }

    private void dfs(int[][] grid, boolean[][] visited, int x, int y, Set<Integer> region, Set<Integer> frontier, int[] wall, int[][] dirs, int m, int n) {
        visited[x][y] = true; // mark as visited
        region.add(x * n + y); // add to region
        for (int[] d : dirs) { // check all directions
            int nx = x + d[0]; // next row
            int ny = y + d[1]; // next column
            if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue; // out of bounds
            if (grid[nx][ny] == 0) { // if uninfected
                wall[0]++; // need a wall
                frontier.add(nx * n + ny); // add to threatened cells
            } else if (grid[nx][ny] == 1 && !visited[nx][ny]) { // if infected and not visited
                dfs(grid, visited, nx, ny, region, frontier, wall, dirs, m, n); // continue dfs
            }
        }
    }
}
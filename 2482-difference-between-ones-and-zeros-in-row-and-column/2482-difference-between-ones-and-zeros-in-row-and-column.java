class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowOnes = new int[m];
        int[] rowZeros = new int[m];
        int[] colOnes = new int[n];
        int[] colZeros = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowOnes[i]++;
                    colOnes[j]++;
                } else {
                    rowZeros[i]++;
                    colZeros[j]++;
                }
            }
        }
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = rowOnes[i] + colOnes[j] - rowZeros[i] - colZeros[j];
            }
        }
        return diff;
    }
}
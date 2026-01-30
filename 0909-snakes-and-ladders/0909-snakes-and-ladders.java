import java.util.*;

class Solution {

    public int snakesAndLadders(int[][] board) {

        int n = board.length;
        int size = n * n;

        int[] oneD = new int[size];
        Arrays.fill(oneD, -1);

        int index = 0;
        boolean leftToRight = true;

        for (int row = n - 1; row >= 0; row--) {
            if (leftToRight) {
                for (int col = 0; col < n; col++) {
                    if (board[row][col] != -1)
                        oneD[index] = board[row][col] - 1;
                    index++;
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    if (board[row][col] != -1)
                        oneD[index] = board[row][col] - 1;
                    index++;
                }
            }
            leftToRight = !leftToRight;
        }

        boolean[] visited = new boolean[size];
        int[] diceCount = new int[size];
        Queue<Integer> queue = new LinkedList<>();

        visited[0] = true;
        queue.add(0);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == size - 1)
                return diceCount[current];

            for (int dice = 1; dice <= 6; dice++) {

                int next = current + dice;
                if (next >= size) continue;

                int finalCell = (oneD[next] != -1)
                        ? oneD[next]
                        : next;

                if (!visited[finalCell]) {
                    visited[finalCell] = true;
                    diceCount[finalCell] = diceCount[current] + 1;
                    queue.add(finalCell);
                }
            }
        }

        return -1;
    }
}

class Solution {
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int cutOffTree(List<List<Integer>> forest) {
        int m = forest.size();
        int n = forest.get(0).size();

        List<int[]> trees = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int height = forest.get(r).get(c);
                if (height > 1) {
                    trees.add(new int[]{height, r, c});
                }
            }
        }

        trees.sort((a, b) -> Integer.compare(a[0], b[0]));

        int totalSteps = 0;
        int startR = 0, startC = 0;

        for (int[] tree : trees) {
            int targetR = tree[1];
            int targetC = tree[2];

            int steps = bfs(forest, startR, startC, targetR, targetC, m, n);
            if (steps == -1) {
                return -1;
            }

            totalSteps += steps;
            startR = targetR;
            startC = targetC;
        }

        return totalSteps;
    }

    private int bfs(List<List<Integer>> forest, int startR, int startC, int targetR, int targetC, int m, int n) {
        if (startR == targetR && startC == targetC) {
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        queue.add(new int[]{startR, startC});
        visited[startR][startC] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc] && forest.get(nr).get(nc) > 0) {
                        if (nr == targetR && nc == targetC) {
                            return steps;
                        }
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr, nc});
                    }
                }
            }
        }

        return -1;
    }
}

class Solution {
    private static final int[][] KNIGHT_MOVES = {
        {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
        {1, -2}, {1, 2}, {2, -1}, {2, 1}
    };
    private static final int BOARD_SIZE = 50;

    public int maxMoves(int kx, int ky, int[][] positions) {
        int[][] distances = new int[positions.length][positions.length];
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions.length; j++) {
                distances[i][j] = minMoves(positions[i][0], positions[i][1], positions[j][0], positions[j][1]);
            }
        }
        
        int[] initialDist = new int[positions.length];
        for (int i = 0; i < positions.length; i++) {
            initialDist[i] = minMoves(kx, ky, positions[i][0], positions[i][1]);
        }
        
        return dfs(initialDist, distances, (1 << positions.length) - 1, -1, true, new HashMap<>());
    }

    private int dfs(int[] initialDist, int[][] distances, int mask, int last, boolean isAlice, Map<Long, Integer> memo) {
        if (mask == 0) return 0;
        
        long key = ((long) mask << 33) | ((long) last << 1) | (isAlice ? 1 : 0);
        if (memo.containsKey(key)) return memo.get(key);
        
        int res = isAlice ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        for (int i = 0; i < initialDist.length; i++) {
            if ((mask & (1 << i)) != 0) {
                int newMask = mask ^ (1 << i);
                int dist = (last == -1) ? initialDist[i] : distances[last][i];
                int subRes = dfs(initialDist, distances, newMask, i, !isAlice, memo);
                if (isAlice) {
                    res = Math.max(res, subRes + dist);
                } else {
                    res = Math.min(res, subRes + dist);
                }
            }
        }
        
        memo.put(key, res);
        return res;
    }

    private int minMoves(int startX, int startY, int endX, int endY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[BOARD_SIZE][BOARD_SIZE];
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], moves = current[2];

            if (x == endX && y == endY) {
                return moves;
            }

            for (int[] move : KNIGHT_MOVES) {
                int newX = x + move[0];
                int newY = y + move[1];
                if (isValid(newX, newY) && !visited[newX][newY]) {
                    queue.offer(new int[]{newX, newY, moves + 1});
                    visited[newX][newY] = true;
                }
            }
        }

        return -1; // Should never reach here if input is valid
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }
}
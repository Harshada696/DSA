import java.util.*;

public class Solution {
    static int n, m;
    static int[][] grid;
    static Boolean[][][][][] dp;
    static final int[] dx = {1, 0};
    static final int[] dy = {0, 1};

    static boolean inBounds(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    static boolean canMove(int x, int y, int val) {
        return inBounds(x, y) && grid[x][y] >= val;
    }

    static boolean dfs(int ax, int ay, int bx, int by, boolean turn) {
        if (dp[ax][ay][bx][by][turn ? 1 : 0] != null) {
            return dp[ax][ay][bx][by][turn ? 1 : 0];
        }

        boolean moved = false;
        if (turn) {
            // Alice's turn
            for (int d = 0; d < 2; d++) {
                int nax = ax + dx[d];
                int nay = ay + dy[d];
                if (canMove(nax, nay, grid[ax][ay])) {
                    moved = true;
                    if (!dfs(nax, nay, bx, by, false)) {
                        return dp[ax][ay][bx][by][1] = true;
                    }
                }
            }
        } else {
            // Bob's turn
            for (int d = 0; d < 2; d++) {
                int nbx = bx + dx[d];
                int nby = by + dy[d];
                if (canMove(nbx, nby, grid[bx][by])) {
                    moved = true;
                    if (!dfs(ax, ay, nbx, nby, true)) {
                        return dp[ax][ay][bx][by][0] = true;
                    }
                }
            }
        }

        return dp[ax][ay][bx][by][turn ? 1 : 0] = !moved && !turn;
    }

    public static int solve(int N, int M, int Q, List<List<Integer>> A, List<List<Integer>> queries) {
        n = N;
        m = M;
        grid = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = A.get(i).get(j);

        int count = 0;

        for (List<Integer> q : queries) {
            int ax = q.get(0) - 1;
            int ay = q.get(1) - 1;
            int bx = q.get(2) - 1;
            int by = q.get(3) - 1;

            dp = new Boolean[n][m][n][m][2];

            if (dfs(ax, ay, bx, by, true)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());
        int M = Integer.parseInt(scan.nextLine().trim());
        int Q = Integer.parseInt(scan.nextLine().trim());

        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Arrays.stream(scan.nextLine().trim().split(" "))
                    .map(Integer::parseInt).toList());
        }

        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            queries.add(Arrays.stream(scan.nextLine().trim().split(" "))
                    .map(Integer::parseInt).toList());
        }

        int result = solve(N, M, Q, A, queries);
        System.out.println(result);
    }
}

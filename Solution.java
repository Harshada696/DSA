import java.util.*;

public class Main {
    
    static int n, m;
    static int[][] grid;
    static boolean[][][] memo;
    
    // Directions: down and right
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};

    static boolean canMove(int x, int y, int val) {
        return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] >= val;
    }

    static boolean dfs(int ax, int ay, int bx, int by, boolean turn) {
        // If already visited this state
        if (memo[ax][ay][turn ? 1 : 0]) return false;

        boolean moved = false;

        if (turn) { // Alice's turn
            for (int i = 0; i < 2; i++) {
                int nax = ax + dx[i];
                int nay = ay + dy[i];
                if (canMove(nax, nay, grid[ax][ay])) {
                    moved = true;
                    if (!dfs(nax, nay, bx, by, false)) {
                        return true;
                    }
                }
            }
        } else { // Bob's turn
            for (int i = 0; i < 2; i++) {
                int nbx = bx + dx[i];
                int nby = by + dy[i];
                if (canMove(nbx, nby, grid[bx][by])) {
                    moved = true;
                    if (!dfs(ax, ay, nbx, nby, true)) {
                        return true;
                    }
                }
            }
        }

        // If no moves possible
        if (!moved) return false;

        memo[ax][ay][turn ? 1 : 0] = true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();  // number of rows
        m = sc.nextInt();  // number of columns

        grid = new int[n][m];

        // Reading the grid
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        int q = sc.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int ax = sc.nextInt() - 1;
            int ay = sc.nextInt() - 1;
            int bx = sc.nextInt() - 1;
            int by = sc.nextInt() - 1;

            // 3D memoization for states
            memo = new boolean[n][m][2];

            // Alice starts -> turn = true
            boolean result = dfs(ax, ay, bx, by, true);
            System.out.println(result ? 1 : 0);
        }
    }
} you gve this code 
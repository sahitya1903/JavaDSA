import java.util.Arrays;

public class knapsack01 {
    public int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(W, val, wt, n, dp);
    }

    private int solve(int W, int val[], int wt[], int n, int[][] dp) {
        if (n == 0 || W == 0) return 0;

        if (dp[n][W] != -1) return dp[n][W];

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + solve(W - wt[n - 1], val, wt, n - 1, dp);
            int exclude = solve(W, val, wt, n - 1, dp);
            return dp[n][W] = Math.max(include, exclude);
        } else {
            return dp[n][W] = solve(W, val, wt, n - 1, dp);
        }
    }
}

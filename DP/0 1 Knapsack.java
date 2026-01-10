//memoization
class Solution {

    public int knapsack(int W, int n, int val[], int wt[], int dp[][]) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        int take = 0;
        if (wt[n - 1] <= W) {
            take = val[n - 1] + knapsack(W - wt[n - 1], n - 1, val, wt, dp);
        }

        int notTake = knapsack(W, n - 1, val, wt, dp);

        return dp[n][W] = Math.max(take, notTake);
    }
    public int knapsack(int W, int val[], int wt[]) {

        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return knapsack(W, n, val, wt, dp);
    }
}

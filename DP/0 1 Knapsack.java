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
//tabular
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
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                int take=0,notTake=0;
                if(i==0||j==0){
                    dp[i][j]=0;
                    continue;
                }
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(
                            val[i-1] + dp[i-1][j - wt[i-1]],
                            dp[i-1][j]
                            );
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }
        }

        return dp[n][W];
    }
}


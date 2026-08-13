class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] dp = new int[n][W+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=W;j++){
                int skip = (i>0) ? dp[i-1][j]:0;
                if(wt[i]>j) dp[i][j]=skip;
                else{
                    int pick = val[i];
                    pick += ((i>0) ? dp[i-1][j-wt[i]] : 0);
                    dp[i][j]= Math.max(pick,skip);
                }
            }
        }
        return dp[n-1][W];
    }
}

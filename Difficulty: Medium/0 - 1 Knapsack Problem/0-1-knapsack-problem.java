class Solution {
    public int MaxProfit(int i,int C, int val[], int wt[],int[][] dp){
        if(i==val.length) return 0;
        if(dp[i][C]!=-1) return dp[i][C];
        int skip = MaxProfit(i+1,C,val,wt,dp);
        if(wt[i]>C) return dp[i][C] = skip;
        int take = val[i]+MaxProfit(i+1,C-wt[i],val,wt,dp);
        return dp[i][C] = Math.max(skip,take);
    }
    public int knapsack(int C, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] dp = new int[n][C+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<C+1;j++) dp[i][j]=-1;
        }
        return MaxProfit(0,C,val,wt,dp);
    }
}

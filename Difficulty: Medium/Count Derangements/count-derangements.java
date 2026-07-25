class Solution {
    public int derangeCount(int n) {
        // code here
        // Tabulation method
        if(n==1) return 0;
        if(n<=3) return n-1;
        int[] dp = new int[n+1];
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2]);
        }
        return dp[n];
    }
};
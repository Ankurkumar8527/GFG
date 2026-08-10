class Solution {
    int Cost(int i,int[] num,int[] dp){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int left = Math.abs(num[i]-num[i-1])+Cost(i-1,num,dp);
        int right = Integer.MAX_VALUE;
        if(i>1) right = Math.abs(num[i]-num[i-2])+Cost(i-2,num,dp);
        return dp[i] = Math.min(left,right);
    }
    int minCost(int[] height) {
        // code here
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Cost(n-1,height,dp);
    }
}
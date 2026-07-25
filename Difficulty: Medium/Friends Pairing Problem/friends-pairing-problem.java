class Solution {
    
    public int pair(int n, int[] dp ){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=(pair(n-1,dp)+(n-1)*pair(n-2,dp));
    }
    
    public int countFriendsPairings(int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return pair(n,dp);
    }
}

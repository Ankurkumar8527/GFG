class Solution {
    public boolean Subsequence(int[] arr,int k,int i,int n,int[][] dp ){
        if(i>=n || k<0) return false;
        if(k==0) return true;
        
        if(dp[i][k]!=-1) return (dp[i][k]==1);
        boolean ans = false;
        boolean skip = Subsequence(arr,k,i+1,n,dp);
        ans = skip;
        if(k-arr[i]==0) return true;
        boolean take = Subsequence(arr,k-arr[i],i+1,n,dp);
        ans = take || skip;
        
        dp[i][k] = (ans) ? 1 : 0;
        return ans;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=k;j++) dp[i][j]=-1;
        }
        return Subsequence(arr,k,0,n,dp);
    }
}
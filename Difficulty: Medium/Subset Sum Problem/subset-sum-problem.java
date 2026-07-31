class Solution {
    static boolean isSubset(int i,int arr[], int sum,int[][] dp){
        if(i==arr.length){
            if(sum==0) return true;
            else return false;
        }
        if(dp[i][sum]!=-1) return (dp[i][sum]==1);
        boolean ans = false;
        boolean skip = isSubset(i+1,arr,sum,dp);
        if(sum-arr[i]<0) ans = skip;
        else{
            boolean take = isSubset(i+1,arr,sum-arr[i],dp);
            ans = take || skip;;
        } 
        if(ans) dp[i][sum]=1;
        else dp[i][sum]=0;
        return ans;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=sum;j++) dp[i][j]=-1;
        }
        return isSubset(0,arr,sum,dp);
    }
}
class Solution {
    public void subSums(int i,int n,int sum,int[] arr,int[][] dp,ArrayList<Integer> ans){
        if(i==n) {
            ans.add(sum);
            return;
        }
        if(i>n) return;
        // take 
        
        subSums(i+1,n,sum+arr[i],arr,dp,ans);
        // skip 
        subSums(i+1,n,sum,arr,dp,ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++) sum+=arr[i];
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=sum;j++) dp[i][j]=-1;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        subSums(0,n,0,arr,dp,ans);
        return ans;
    }
}
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int j=0;
        int sum = 0;
        int maxSum = 0;
        while(j<k) sum+=arr[j++];
        int i=1;
        maxSum=Math.max(maxSum,sum);
        while(i<n && j<n){
            sum = sum+arr[j]-arr[i-1];
            maxSum=Math.max(maxSum,sum);
            i++;
            j++;
        }
        return maxSum;
    }
}
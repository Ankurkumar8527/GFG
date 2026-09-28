class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = wt.length;
        double[][] arr =  new double[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = val[i];
            arr[i][1] = wt[i];
            arr[i][2] = (double)val[i]/wt[i];
        }
        Arrays.sort(arr, (a,b)->Double.compare(b[2],a[2]));
        
        double ans = 0; 
        for(int i=0;i<n && capacity>0;i++){
            if(arr[i][1]<=capacity){
                ans += arr[i][0];
                capacity-=arr[i][1];
            }
            else if(arr[i][1]>capacity && capacity>0){
                ans+= (capacity/arr[i][1])*arr[i][0];
                capacity=0;
            }
        }
        return ans;
    }
}
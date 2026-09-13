class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];
        int secmax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secmax){
                secmax=arr[i];
            }
        }
        return secmax==0 ? -1 : secmax;
    }
}
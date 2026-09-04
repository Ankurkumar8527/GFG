class Solution {
    public int firstIndex(int arr[]) {
        // code here
        int lo  = 0, hi = arr.length-1;
        int idx = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==1){
                idx = Math.min(idx,mid);
                hi=mid-1;
            }
            else lo = mid+1;
        }
        return idx==Integer.MAX_VALUE ? -1 : idx;
    }
}
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int idx = arr.length;
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=target){
                idx = Math.min(idx,mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return idx;
    }
}

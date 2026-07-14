class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        for(int i=1;i<n;i++) arr[i]+=arr[i-1];
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]==k) count++;
            if(map.containsKey(arr[i]-k)) 
            count+=map.get(arr[i]-k);
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
        return count;
    }
}
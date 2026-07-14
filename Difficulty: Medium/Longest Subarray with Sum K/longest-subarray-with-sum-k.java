class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen = 0;

        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<n;i++){
            if(arr[i]==k)
            maxlen=i+1;
            if(map.containsKey(arr[i]-k))
            maxlen=Math.max(maxlen,i-map.get(arr[i]-k));
            if(!map.containsKey(arr[i]))
            map.put(arr[i],i);
        }
        return maxlen;
    }
}

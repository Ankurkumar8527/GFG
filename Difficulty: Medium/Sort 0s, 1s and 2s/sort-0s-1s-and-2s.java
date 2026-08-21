class Solution {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int z = 0, o = 0, t = 0;
        for(int ele : arr){
            if(ele==0) z++;
            else if(ele==1) o++;
            else t++;
        }
        int i=0;
        while(i<z)  arr[i++]=0;
        o+=i;
        while(i<o) arr[i++]=1;
        t+=i;
        while(i<t) arr[i++]=2;
        
    }
}
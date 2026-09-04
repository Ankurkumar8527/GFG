class Solution {
    int count;
    public void merge(int[] arr,int[] a,int[] b){

       int i = 0;
       int j = 0;
       int k = 0;
       while(i<a.length && j<b.length){
           if(a[i]<=b[j]){ 
               arr[k++]=a[i++];
           }
           else arr[k++]=b[j++];
       }
       while(i<a.length) arr[k++]=a[i++];
       while(j<b.length) arr[k++]=b[j++];
    }
    public void inversionCount(int[] a,int[] b){
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += (a.length-i);
                j++;
            }
            else i++;
        }
    }
    public void mergeSort(int arr[]) {
        // code here
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<n/2;i++) a[i] = arr[i];
        for(int i=0;i<n-n/2;i++) b[i] = arr[i+n/2];
        mergeSort(a);
        mergeSort(b);
        inversionCount(a,b);
        merge(arr,a,b);
        a=null;
        b=null;
    }
    public int inversionCount(int arr[]) {
        // code here
        count = 0;
        mergeSort(arr);
        return count;
    }
}
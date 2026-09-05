class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high) return;
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    private void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    private int partition(int[] arr, int low, int high) {
        // code here
        int idx = low + (high-low)/2;
        int pivot = arr[idx];
        int sc = 0;
        
        for(int i=low;i<=high;i++){
            if(i==idx) continue;
            if(pivot>=arr[i]) sc++;
        }
        int cc = low+sc;
        
        swap(arr,idx,cc);
        
        int i = low;int j=high;
        
        while(i<cc && j>cc){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j); 
                i++;j--;
            }
               
        }
        return cc;
    }
}
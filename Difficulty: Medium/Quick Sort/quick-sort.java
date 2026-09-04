class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high) return;
        int pidx = partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1,high);
        
    }
    private void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[low];
        int sc = 0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) sc++;
        }
        int cc = sc+low;
        swap(arr,cc,low);
        
        int i = low, j = high;
        while(i<cc && j>cc){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return cc;
    }
}
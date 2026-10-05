class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wt = 0, t=0;
        for(int ele : bt ){
            wt+=t;
            t+=ele;
        }
        return wt/bt.length;
    }
}

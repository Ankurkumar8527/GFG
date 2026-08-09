class Solution {
    public int countWays(int n) {
        // code here
        if(n<=2) return n;
        int a = 1;
        int b = 2;
        for(int i=3;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
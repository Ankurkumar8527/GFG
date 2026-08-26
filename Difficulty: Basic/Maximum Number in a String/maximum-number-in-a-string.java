class Solution {
    static int extractMaximum(String s) {
        // code here
        int maxnum = -1;
        int c = 0;
        int n = s.length();
        int i=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n){
            int num = 0;
            int j=i;
            while(j<n && Character.isDigit(s.charAt(j))){
              int ele = s.charAt(j)-'0';
              num=num*10+ele;
              c++;
              j++;
            }
            i=j;
             maxnum =  c>0 ? Math.max(maxnum,num): maxnum ;
            i++;
        }
        return maxnum;
    }
}

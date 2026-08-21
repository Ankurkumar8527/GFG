class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if(n==1){
            ans.add(-1);
            return ans;
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        int i = n-2;
        ans.add(-1);
        while(i>=0){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            if(st.isEmpty()) ans.add(0,-1);
            else ans.add(0,st.peek());
            st.push(arr[i]);
            i--;
        }
        return ans;
    }
}
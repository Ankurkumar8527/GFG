class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            int ele = arr[i];
            while(!s.isEmpty() && s.peek()<=ele) s.pop();
            if(s.isEmpty()) ans.add(0,-1);
            else ans.add(0,s.peek());
            s.push(ele);
        }
        return ans;
    }
}
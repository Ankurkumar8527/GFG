/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public void DFS(Node root,int level,List<Integer> ans){
        if(root==null) return;
        ans.set(level,root.data);
        DFS(root.left,level+1,ans);
        DFS(root.right,level+1,ans);
    }
    public ArrayList<Integer> rightView(Node root) {
        // code here
        int n = levels(root);
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(0);
        DFS(root,0,arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int val:arr) ans.add(val);
        return ans;
    }
}
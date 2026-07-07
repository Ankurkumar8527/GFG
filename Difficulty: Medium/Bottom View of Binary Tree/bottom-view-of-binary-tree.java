/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
        public int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public ArrayList<Integer> BFS(Node root){
       ArrayList<Integer> ans = new ArrayList<>();
       TreeMap<Integer,Integer> map = new TreeMap<>(); 
        int n = levels(root);
        Queue<Pair> q = new LinkedList<>();
        int prevlevel=0;
        if(root!=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            int level = front.level;
            map.put(level,front.node.data);
            if(front.node.left!=null) q.add(new Pair(front.node.left,level-1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,level+1));
        }
        for(int key : map.keySet()) ans.add(map.get(key));
        return ans;
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        return BFS(root);
    }
}
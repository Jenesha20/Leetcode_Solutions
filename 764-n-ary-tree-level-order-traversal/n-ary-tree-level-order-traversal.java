/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null)
        return l;
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                Node temp=q.poll();
                l1.add(temp.val);
                if(temp.children!=null)
                {
                  q.addAll(temp.children);
                }
            }
            l.add(l1);
        }
        return l;
    }
}
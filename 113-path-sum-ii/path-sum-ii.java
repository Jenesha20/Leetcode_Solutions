/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int ts) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        dfs(root,ts,l2,l);
        return l;
    }
    public void dfs(TreeNode root,int ts,List<Integer> cur,List<List<Integer>> l)
    {
        if(root==null)
        return;
        cur.add(root.val);
        ts-=root.val;
        if(root.left==null && root.right==null && ts==0)
        l.add(new ArrayList<>(cur));
        else
        {
            dfs(root.left,ts,cur,l);
            dfs(root.right,ts,cur,l);
        }
        cur.remove(cur.size()-1);
    }
}
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
    int c=0;
    public int pathSum(TreeNode root, int ts) {
       if(root ==null)
       return 0;
       dfs(root,ts,0);
       pathSum(root.left,ts);
       pathSum(root.right,ts);
       return c;
    }
    public void dfs(TreeNode root,int ts,long s)
    {
        if(root==null)
        return;
        s+=root.val;
        if(s==ts)
        c++;
        dfs(root.left,ts,s);
        dfs(root.right,ts,s);
    }
   
}
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
    int maxtime=0;
    public int amountOfTime(TreeNode root, int start) {
        find(root,start);
        return maxtime;
    }
    public int find(TreeNode root,int target)
    {
        if(root==null)
        return -1;
        if(root.val==target)
        {
            dfs(root,0);
            return 1;
        }
        int left=find(root.left,target);
        if(left>0)
        {
            dfs(root.right,left+1);
            maxtime=Math.max(maxtime,left);
            return left+1;
        }
        int right=find(root.right,target);
        if(right>0)
        {
            dfs(root.left,right+1);
            maxtime=Math.max(maxtime,right);
            return right+1;
        }
        return -1;
    }
    public void dfs(TreeNode root,int time)
    {
        if(root ==null)
        return ;
        maxtime=Math.max(maxtime,time);
        dfs(root.left,time+1);
        dfs(root.right,time+1);
    }
}
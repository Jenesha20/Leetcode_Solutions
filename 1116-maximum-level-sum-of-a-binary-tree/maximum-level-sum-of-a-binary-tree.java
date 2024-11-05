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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        if(root==null)
        return 0;
        q.add(root);
        int m=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            int n=q.size();
            int s=0;
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                s+=temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            m=Math.max(m,s);
            l.add(s);
        }
        return l.indexOf(m)+1;
    }
}
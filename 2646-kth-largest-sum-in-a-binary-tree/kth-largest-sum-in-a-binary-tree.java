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
    public long kthLargestLevelSum(TreeNode root, int k) {
       Queue<TreeNode> q=new LinkedList<>();
       List<Long> l=new ArrayList<>();
       if(root==null)
       return (long)0;
       q.add(root);
       while(!q.isEmpty())
       {
        int n=q.size();
        long s=0;
        for(int i=0;i<n;i++)
        {
            TreeNode temp=q.poll();
            s+=temp.val;
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
        }
        l.add(s);
       }
       Collections.sort(l);
       if(l.size()<k)
       return -1;
       return l.get(l.size()-k);
    }
}
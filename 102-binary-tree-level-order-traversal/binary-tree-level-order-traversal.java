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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
        return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
          int i=q.size();
          List<Integer> l2=new ArrayList<>();
          for(int j=0;j<i;j++)
          {
            TreeNode temp=q.poll();
            l2.add(temp.val);
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
          }
          l.add(l2);
        }
        return l;
    }
}
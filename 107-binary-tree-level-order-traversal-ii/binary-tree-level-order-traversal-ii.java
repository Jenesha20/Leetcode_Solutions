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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return l;
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                l1.add(temp.val);
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
            l.add(l1);
        }
        Collections.reverse(l);
        return l;
    }
}
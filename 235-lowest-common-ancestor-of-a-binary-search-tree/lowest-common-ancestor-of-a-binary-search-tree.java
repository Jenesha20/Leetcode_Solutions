/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // List<TreeNode> l1=new ArrayList<>();
    // List<TreeNode> l2=new ArrayList<>();
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     find(root,p,l1);
    //     find(root,q,l2);
    //     TreeNode res=null;
    //     for(int i=l1.size()-1;i>=0;i--)
    //     {
    //         if(l2.contains(l1.get(i)))
    //         {
    //             res=l1.get(i);
    //             break;
    //         }
    //     }
    //     return res;

    // }
    // public boolean find(TreeNode root,TreeNode target,List<TreeNode> l)
    // {
    //     if(root==null)
    //     return false;
    //     l.add(root);
    //     if(root==target)
    //     return true;
    //     if(find(root.left,target,l) || find(root.right,target,l))
    //     return true;

    //     l.remove(l.size()-1);
    //     return false;
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root ==q)
        return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right !=null)
        return root;
        return left!=null ? left:right;
    }
}
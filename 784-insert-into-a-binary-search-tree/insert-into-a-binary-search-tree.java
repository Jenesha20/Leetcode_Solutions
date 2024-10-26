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
    public TreeNode insert(TreeNode root,int n)
    {
        TreeNode newnode=new TreeNode(n);
        TreeNode temp=root;
        if(root==null)
        {
            root=newnode;
            return root;
        }
        while(true)
        {
            if(temp.val>newnode.val)
            {
                if(temp.left==null)
                {
                    temp.left=newnode;
                    break;
                }
                else
                {
                    temp=temp.left;
                }
            }
            if(temp.val<newnode.val)
            {
                if(temp.right==null)
                {
                    temp.right=newnode;
                    break;
                }
                else
                {
                    temp=temp.right;
                }
            }
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
}
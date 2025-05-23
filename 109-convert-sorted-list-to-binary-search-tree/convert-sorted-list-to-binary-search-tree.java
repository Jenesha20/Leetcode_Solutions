/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    TreeNode root=null;
    public TreeNode bst(ListNode start,ListNode end)
    {
      if(start==end)
      return null;
      ListNode slow=start;
      ListNode fast=start;
      while(fast!=end && fast.next!=end)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      TreeNode root=new TreeNode(slow.val);
      root.left=bst(start,slow);
      root.right=bst(slow.next,end);
      return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
       if(head==null)
       return null;
       return bst(head,null);
    }
}
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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur=head;
        int n=0;
        while(cur!=null)
        {
            n++;
            cur=cur.next;
        }
        cur=head;
        ListNode t1=head;
        ListNode t2=head;
        for(int i=0;i<k-1;i++)
        {
            t1=t1.next;
        }
        for(int i=0;i<n-k;i++)
        {
           t2=t2.next;
        }
        int temp=t1.val;
        t1.val=t2.val;
        t2.val=temp;
        return head;
    }
}
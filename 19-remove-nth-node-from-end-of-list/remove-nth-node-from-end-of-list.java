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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode cur=head;
     int k=0;
     while(cur!=null)   
    {
        k++;
        cur=cur.next;
    }
    cur=head;
    ListNode prev=null;
    if(k==1 || k==0)
    return null;
    if(k==n)
    return head.next;
    for(int i=0;i<k-n;i++)
    {
       prev=cur;
       cur=cur.next;
    }
    if(prev!=null)
    {
        prev.next=cur.next;
    }
    return head;
    }
}
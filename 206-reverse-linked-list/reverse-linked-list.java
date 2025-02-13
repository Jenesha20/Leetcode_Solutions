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
    public ListNode reverseList(ListNode head) {
        
    //   ListNode cur=head;
    //   ListNode prev=null;
    //   while(cur!=null)
    //   {
    //     ListNode next=cur.next;
    //     cur.next=prev;
    //     prev=cur;
    //     cur=next;
    //   }  
    //   return prev;
    List<Integer> l=new ArrayList<>();
    ListNode cur=head;
    while(cur!=null)
    {
        l.add(cur.val);
        cur=cur.next;
    }
    cur=head;
    Collections.reverse(l);
    int i=0;
    while(cur!=null)
    {
        cur.val=l.get(i++);
        cur=cur.next;
    }
    return head;
    }
}
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
    public ListNode insertionSortList(ListNode head) {
        // List<Integer> l=new ArrayList<>();
        // ListNode cur=head;
        // while(cur!=null)
        // {
        //     l.add(cur.val);
        //     cur=cur.next;
        // }
        // Collections.sort(l);
        // cur=head;
        // int i=0;
        // while(cur!=null)
        // {
        //     cur.val=l.get(i++);
        //     cur=cur.next;
        // }
        // return head;
        ListNode cur=head,next=null;
        ListNode l=new ListNode(0);
        while(cur!=null)
        {
            next=cur.next;
            ListNode p=l;
            while(p.next!=null && p.next.val<cur.val)
            p=p.next;

            cur.next=p.next;
            p.next=cur;
            cur=next;
        }
        return l.next;

    }
}
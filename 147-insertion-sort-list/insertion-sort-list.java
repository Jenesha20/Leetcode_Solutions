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
        List<Integer> l=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            l.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(l);
        cur=head;
        int i=0;
        while(cur!=null)
        {
            cur.val=l.get(i++);
            cur=cur.next;
        }
        return head;

    }
}
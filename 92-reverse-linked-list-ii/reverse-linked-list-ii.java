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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> l=new ArrayList<>();
        ListNode  tem=head;
        while(tem!=null)
        {
            l.add(tem.val);
            tem=tem.next;
        }
        List<Integer> l2=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            l2.add(l.get(i-1));
        }
        int j=0;
        Collections.reverse(l2);
        for(int i=left;i<=right;i++)
        {
            l.set(i-1,l2.get(j++));
        }
        j=0;
        tem=head;
        while(tem!=null)
        {
            tem.val=l.get(j++);
            tem=tem.next;
        }
        return head;

    }
}
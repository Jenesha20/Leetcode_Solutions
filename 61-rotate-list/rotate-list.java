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
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> l=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            l.add(cur.val);
            cur=cur.next;
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[(i+k)%l.size()]=l.get(i);
        }
        cur=head;
       for(int i=0;i<l.size();i++)
       {
        cur.val=res[i];
        cur=cur.next;
       }
       return head;

    }
}
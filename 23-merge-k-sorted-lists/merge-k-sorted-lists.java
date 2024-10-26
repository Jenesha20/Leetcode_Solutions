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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
           ListNode cur=lists[i];
           while(cur!=null)
           {
            l.add(cur.val);
            cur=cur.next;
           }
        }
        Collections.sort(l);
        ListNode dum=new ListNode(0);
        ListNode tail=dum;
        for(int x:l)
        {
            tail.next=new ListNode(x);
            tail=tail.next;
        }
        return dum.next;
        
    }
}
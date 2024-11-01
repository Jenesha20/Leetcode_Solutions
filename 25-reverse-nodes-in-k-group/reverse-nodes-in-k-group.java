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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        int j=0;
        for(int i=0;i<l.size();i++)
        {
            int t=k;
            List<Integer> l1=new ArrayList<>();
            if(l.size()-j>=k) 
            {
            while(t!=0 && j<l.size())
            { 
              l1.add(l.get(j++));
              t--;
            }
            Collections.reverse(l1);
            l2.addAll(l1);
            }
        }
        if(l2.size()<l.size())
        {
          for(int i=l2.size();i<l.size();i++)
          {
            l2.add(l.get(i));
          }
        }
        ListNode a1=new ListNode(0);
        ListNode cur=a1;
        for(int i:l2)
        {
            cur.next=new ListNode(i);
            cur=cur.next;
        }
        return a1.next;
        
    }
}
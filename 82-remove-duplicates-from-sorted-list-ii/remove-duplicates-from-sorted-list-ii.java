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
    ListNode tail=null,h=null;
    public ListNode deleteDuplicates(ListNode head) {
       TreeMap<Integer,Integer> tmap=new TreeMap<>();
       ListNode temp=head;
       while(temp!=null)
       {
        tmap.put(temp.val,tmap.getOrDefault(temp.val,0)+1);
        temp=temp.next;
       }
       //int n=0;
       for(int x:tmap.keySet())
       {
        if(tmap.get(x)==1)
        {
            //n++;
            insert(x);
        }
       }
       return h;
    }
    public void insert(int n)
    {
        ListNode newnode=new ListNode(n);
        if(h==null)
        {
            h=newnode;
            tail=h;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        
    }
}
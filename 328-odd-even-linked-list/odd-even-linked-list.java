// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         List<Integer> l=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null)
//         {
//             l.add(temp.val);
//             temp=temp.next;
//         }
//         temp=head;
//         for(int i=0;i<l.size();i+=2)
//         {
//             temp.val=l.get(i);
//             temp=temp.next;
//         }
//         for(int i=1;i<l.size();i+=2)
//         {
//             temp.val=l.get(i);
//             temp=temp.next;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head, even = head.next, evenHead = even;
        while(even!=null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

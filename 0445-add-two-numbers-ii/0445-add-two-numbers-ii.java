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
    static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode fwd=null;
        ListNode prev=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode d1=dummy;
        int sum=0, carry=0;
        ListNode head1=reverse(l1);
        ListNode head2=reverse(l2);
        while(head1!=null || head2!=null){
            int val1 = 0;
            int val2 = 0;

            if(head1 != null) {
                val1 = head1.val;
                head1 = head1.next;
            }

            if(head2 != null) {
                val2 = head2.val;
                head2 = head2.next;
            }
            sum=carry+val1+val2;
                carry=sum/10;
                 sum=sum%10;
            ListNode a=new ListNode(sum);
            d1.next=a;
            d1=d1.next;
        }
        if(carry != 0) {
            d1.next = new ListNode(carry);
        }
        ListNode b=reverse(dummy.next);
        return b;
    }
}
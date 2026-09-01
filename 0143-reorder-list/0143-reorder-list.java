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
    static int length(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
         temp=temp.next;
         c++;
        }
        return c;
    }
    static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=new ListNode(-1);
        ListNode d1=dummy;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev;
        int n=length(head);
        if(n%2==0){
            rev=reverse(slow.next);
            slow.next=null;
        }
        else {
            rev=reverse(slow.next);
            slow.next=null;
        }
        while (temp != null && rev != null) {

            ListNode t = temp.next;
            ListNode r = rev.next;

            d1.next = temp;
            d1 = d1.next;

            d1.next = rev;
            d1 = d1.next;

            temp = t;
            rev = r;
        }

        if (temp != null)
            d1.next = temp;

        if (rev != null)
            d1.next = rev;
    }
}
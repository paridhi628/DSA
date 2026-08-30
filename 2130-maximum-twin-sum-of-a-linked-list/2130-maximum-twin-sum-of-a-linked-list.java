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
    public int pairSum(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
        int max=0;
        ListNode i=head;
        ListNode j=head2;
        while(j!=null && i!=null){
         int sum=i.val+j.val;
         max=Math.max(sum,max);
         i=i.next;
         j=j.next;
        }
        return max;
    }
}
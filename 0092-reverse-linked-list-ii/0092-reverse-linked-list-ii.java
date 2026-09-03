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
        if(head == null || left == right)
            return head;
        ListNode temp1=head;
       ListNode prevLeft=null;
       for(int i=1;i<left;i++){
        prevLeft=temp1;
        temp1=temp1.next;
       }
       ListNode curr=temp1;
       ListNode prev=null;
       ListNode fwd=null;
       for(int i=left;i<=right;i++){
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
       }
       if(prevLeft!=null){
        prevLeft.next=prev;
       }
       else {
        head=prev;
       }
       temp1.next=curr;
       return head;

    }
}
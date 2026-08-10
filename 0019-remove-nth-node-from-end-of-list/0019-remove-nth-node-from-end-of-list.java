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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
       ListNode fast=head;
       ListNode slow=head;
       int c=0;
       for(int i=0;i<n;i++){
        fast=fast.next;
       }
       if(fast==null){
        return head.next;
       }
       while(fast!=null){
        slow=slow.next;
        fast=fast.next;
        c++;
       }
       ListNode temp=head;
       for(int i=0;i<c-1;i++){
            temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
        
    }
}
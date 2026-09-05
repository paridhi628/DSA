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
    public static void reverse(ListNode head){
         ListNode curr=head;
       ListNode prev=null;
       ListNode fwd=null;
       while(curr!=null){
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
    }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
    //     if(head == null || left == right)
    //         return head;
    //     ListNode temp1=head;
    //    ListNode prevLeft=null;
    //    for(int i=1;i<left;i++){
    //     prevLeft=temp1;
    //     temp1=temp1.next;
    //    }
    //    ListNode curr=temp1;
    //    ListNode prev=null;
    //    ListNode fwd=null;
    //    for(int i=left;i<=right;i++){
    //     fwd=curr.next;
    //     curr.next=prev;
    //     prev=curr;
    //     curr=fwd;
    //    }
    //    if(prevLeft!=null){
    //     prevLeft.next=prev;
    //    }
    //    else {
    //     head=prev;
    //    }
    //    temp1.next=curr;
    //    return head;
    if (head == null || left == right) {
            return head;
        }
    ListNode dummy=new ListNode(-1);
    ListNode temp=dummy;
    dummy.next=head;
    for(int i=1;i<=left-1;i++){
        temp=temp.next;
    }
    ListNode tail1=temp;
    ListNode head2=temp.next;
    for(int i=1;i<=right-left+1;i++){
        temp=temp.next;
    }
    ListNode tail2=temp;
    ListNode head3=temp.next;
    tail1.next=null;
    tail2.next=null;
     reverse(head2);
    tail1.next = tail2;
    head2.next=head3;
    return dummy.next;
}
}
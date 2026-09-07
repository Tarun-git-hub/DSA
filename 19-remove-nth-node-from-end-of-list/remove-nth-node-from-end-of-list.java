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
        if(head==null || head.next==null && n==1){
            return null;
        }
        ListNode prev = head;
        ListNode curr = head;
        for(int i=1;i<=n;i++){
            curr=curr.next;
        }
        ListNode previous = null;
        while(curr!=null){
            curr=curr.next;
            previous=prev;
            prev=prev.next;
        }
        if (previous == null) {
            return head.next;
        }
       previous.next=prev.next;
        return head;
    }
}
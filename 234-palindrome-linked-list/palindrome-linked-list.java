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
    public ListNode getMidPoint(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        // mid point
        ListNode list2 = getMidPoint(head);
        // separate l1,l2
        ListNode temp=head;
        while(temp.next!=list2){
            temp=temp.next;
        }
        temp.next=null;
        // reverse list2
        ListNode head2 = reverseLL(list2);
        // compare list1,list2
        ListNode temp1=head;
        ListNode temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return true;
    }
}
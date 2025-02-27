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
     public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr !=  null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head=pre;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=reverseList(slow);
        fast=head;
        boolean f=true;
        while(slow != null){
        if(slow.val != fast.val){
            f=false;
            break;

        }
        slow=slow.next;
        fast=fast.next;
        }
        return f;
    }
}
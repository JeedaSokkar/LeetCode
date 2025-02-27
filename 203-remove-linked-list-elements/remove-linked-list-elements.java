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
    public ListNode removeElements(ListNode head, int val) {
      if(head == null)return null;
      while(head != null && head.val == val)head=head.next;
      ListNode sear=head;
      while(sear !=null && sear.next != null){
          if(sear.next.val == val){
              sear.next=sear.next.next;
          }
          else{sear=sear.next;}
        
      }
return head;
    }
}
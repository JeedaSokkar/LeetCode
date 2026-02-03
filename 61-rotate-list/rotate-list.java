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
    public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null){
        return head;
    }
    ListNode current=head;
    int size=1;

    while(current.next != null){
        current=current.next;
        size++;
    }
    k= size-(k%size);
    if(k == 0)return head;
    current.next=head;
    for(int i=0;i<k;i++){
        current=current.next;
    }
    head=current.next;
    current.next=null;
    return head;
    }
}
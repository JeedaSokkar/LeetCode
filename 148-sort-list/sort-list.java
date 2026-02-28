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
    ListNode head = null;

    public ListNode sortList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode mid=getMid(head);
            ListNode right=mid.next;
            mid.next=null;

            ListNode sortLeft=sortList(head);
            ListNode sortRight=sortList(right);
        return merge(sortLeft,sortRight);
    }

    public ListNode getMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1 != null)tail.next=list1;
        if(list2 != null)tail.next=list2;
        return dummy.next;
    }
}
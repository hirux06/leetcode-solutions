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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode smaller = new ListNode(-1);
        ListNode larger = new ListNode(-1);
        ListNode t1 = smaller;
        ListNode t2 = larger;
        while(head != null){
            if(head.val < x){
                t1.next = head;
                t1 = t1.next;
            }else {
                t2.next = head;
                t2 = t2.next;
            }
            head = head.next;
        }
        if(smaller.next == null){
            return larger.next;
        }
        t2.next = null;
        t1.next = larger.next;
        return smaller.next;
    }
}
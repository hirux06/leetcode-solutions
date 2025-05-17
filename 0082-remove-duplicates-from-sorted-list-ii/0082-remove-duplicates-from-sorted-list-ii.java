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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode t1 = head;
        while(t1 != null){
            if(t1.next != null && t1.val == t1.next.val){
                while(t1.next != null && t1.val == t1.next.val){
                    t1 = t1.next;
                }

                prev.next = t1.next;
                
            }else{
                prev = prev.next;
            }
            t1 = t1.next;
        }

        return dummy.next;
    }
}
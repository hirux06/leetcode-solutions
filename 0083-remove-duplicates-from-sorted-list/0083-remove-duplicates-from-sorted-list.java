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
        ListNode t1 = head;
        ListNode t2 = head.next;
        while(t2 != null){
            if(t1.val != t2.val){
                t2 = t2.next;
                t1 = t1.next;
            }else{
                t2 = t2.next;
                t1.next = t1.next.next;
            }
        }

        return head;
    }
}
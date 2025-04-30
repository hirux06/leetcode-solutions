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
    
    public ListNode oddEvenList(ListNode head) {
        // ListNode head1 = head;
        // ListNode head2 = head.next;
        // ListNode dummyNode = new ListNode(-1);
        // ListNode currNode = dummyNode;
        // while(head1 != null && head1.next != null){
        //     currNode.next = head1;
        //     head1 = head1.next.next;
        //     currNode = currNode.next;
        // }

        // while(head2 != null && head2.next != null){
        //     currNode.next = head2;
        //     head2 = head2.next.next;
        //     currNode = currNode.next;
        // }

        // return dummyNode.next;
        if( head == null || head.next == null){
            return head;
        }
        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode even = head2;
        while(head2 != null && head2.next != null){
            head1.next = head1.next.next;
            head2.next = head2.next.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        head1.next = even;
        return head;
    }
}
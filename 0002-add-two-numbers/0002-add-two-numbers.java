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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode currNode = dummyHead;
        while(head1 != null || head2 != null){
            int sum=carry;
            if(head1 != null){
                sum += head1.val;
            }
            if(head2 != null){
                sum += head2.val;
            }
            carry = sum/10;
            currNode.next = new ListNode(sum%10);
            if(head1 != null){
                head1 = head1.next;
            }
            if(head2 != null){
                head2 = head2.next;
            }
            currNode = currNode.next;
        }

        if(carry > 0){
            currNode.next = new ListNode(carry);
        }

        return dummyHead.next;
        
    }
}
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
    public ListNode findKthNode(ListNode temp, int d){
        int pos = 1;
        while(temp != null){
            if(pos == d){return temp;}
            pos++;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        if(k % len == 0) return head;
      
        
        k = k % len;
          tail.next = head;
        ListNode kthNode = findKthNode(head, len - k);
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }
}
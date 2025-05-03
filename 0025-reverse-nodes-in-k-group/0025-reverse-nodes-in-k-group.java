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
    public ListNode reverse(ListNode temp){
        ListNode prev = null;
        ListNode curr = temp;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public ListNode findKthNode(ListNode temp,int k){
        --k;
        while(k-- > 0 && temp != null){
            temp = temp.next;
        }

        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
        while( temp != null){
            ListNode kthNode = findKthNode(temp, k);
            if(kthNode == null){
                if(prevNode != null){
                    prevNode.next = temp;
                }
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}
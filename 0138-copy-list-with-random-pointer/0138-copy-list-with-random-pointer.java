/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        Node oldTemp = head.next;
        Node temp = newHead;
        map.put(head, newHead);
        while(oldTemp != null){
            Node copyNode = new Node(oldTemp.val);
            map.put(oldTemp, copyNode);
            temp.next = copyNode;
            temp = temp.next;
            oldTemp = oldTemp.next;
        }
        oldTemp = head;
        temp = newHead;
        while(oldTemp != null){
            temp.random = map.get(oldTemp.random);
            temp = temp.next;
            oldTemp = oldTemp.next;
        }
        return newHead;
    }
}
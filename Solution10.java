/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        
        while(curr != null){
            if(curr.child == null){
                curr = curr.next;
                continue;
            }
            
            Node temp = curr.child;
            
            while(temp.next != null){
                temp = temp.next;
            }
            
            if(curr.next != null)
                curr.next.prev = temp;
            
            temp.next = curr.next;
            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
        }
        
        return head;
    }
}

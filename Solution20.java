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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp_head = new ListNode(-1);
        temp_head.next = head;
        
        ListNode temp = temp_head;
        ListNode prev = null;
        
        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
            }else{
                prev = temp;
            }
            
            temp = temp.next;
        }
        
        return temp_head.next;
    }
}

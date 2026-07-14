// Last updated: 7/14/2026, 2:01:33 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;        
        node.next = node.next.next;      
    }
}

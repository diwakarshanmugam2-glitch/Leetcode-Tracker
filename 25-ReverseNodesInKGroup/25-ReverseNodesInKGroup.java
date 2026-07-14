// Last updated: 7/14/2026, 2:03:19 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode node = head;
        for (int i = 0; i < k; i++) {
            if (node == null) return head;  
            node = node.next;
        }
        ListNode prev = null, curr = head, next = null;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }
}

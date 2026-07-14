// Last updated: 7/14/2026, 2:01:34 PM
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;
        ListNode tempSecond = secondHalf;
        boolean isPalin = true;
        
        while (tempSecond != null) {
            if (firstHalf.val != tempSecond.val) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        reverseList(secondHalf);
        
        return isPalin;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
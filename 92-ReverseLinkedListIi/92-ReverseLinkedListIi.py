# Last updated: 7/14/2026, 2:02:14 PM
class Solution:
    def reverseBetween(self, head, left, right):
        
        if not head or left == right:
            return head

        dummy = ListNode(0)
        dummy.next = head

        # Move prev to node before left
        prev = dummy
        for _ in range(left - 1):
            prev = prev.next

        curr = prev.next

        # Reverse sublist
        for _ in range(right - left):
            temp = curr.next
            curr.next = temp.next
            temp.next = prev.next
            prev.next = temp

        return dummy.next
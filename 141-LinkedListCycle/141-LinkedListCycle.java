// Last updated: 7/14/2026, 2:01:56 PM
import java.util.HashSet;

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return true; 
            }
            visited.add(current);
            current = current.next;
        }
        
        return false; 
    }
}


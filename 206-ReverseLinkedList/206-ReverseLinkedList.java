// Last updated: 7/14/2026, 2:01:45 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode h2=null;
        while(head !=null){
            ListNode temp = head;
            head=head.next;
            temp.next=h2;
            h2= temp;

        }
        return h2;
        
    }
}
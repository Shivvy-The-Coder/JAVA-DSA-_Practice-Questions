
class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode ahead = head.next;
        prev.next = ahead.next;
        ahead.next = prev;
        head = ahead;
        while (prev.next != null && prev.next.next != null) {
            ListNode temp = prev.next;
            ahead = temp.next;

            temp.next = ahead.next;
            ahead.next = temp;
            prev.next = ahead;

            prev = temp;
        }

        return head;
    }
}
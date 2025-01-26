

public class Q237Leetcode {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public void deleteNode(ListNode node) {
            ListNode ahead = node.next;
            node.val = ahead.val;
            node.next = ahead.next;
            ahead = null;
        }
    }

}

package Leetcode_LinkedList_Questions;

public class Q160Leetcode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        int count1 = 0, count2 = 0;
        while (h1 != null) {
            h1 = h1.next;
            count1++;
        }
        while (h2 != null) {
            h2 = h2.next;
            count2++;
        }
        if (count1 >= count2) {
            while (count1 != count2) {
                headA = headA.next;
                count2++;
            }
        } else {
            while (count2 != count1) {
                headB = headB.next;
                count1++;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}

// public class Solution {
// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
// ListNode A =headA;
// ListNode B =headB;
// while(A!=B)
// {
// if(A==null)
// A=headB;
// else
// A=A.next;

// if(B==null)
// B=headA;
// else
// B=B.next;
// }
// return B;
// }
// }
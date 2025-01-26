package Leetcode_LinkedList_Questions;

public class Q19Leetcode {

    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode Dummy = new ListNode();
        Dummy.next=head;
        ListNode first =Dummy;    
        ListNode second =Dummy;

        for (int i=0;i<=n;i++)
            {
                first=first.next;

            }   
        while(first!=null)
            {
                first=first.next;
                second=second.next;
            } 
        second.next=second.next.next;

        return Dummy.next;
    }
}
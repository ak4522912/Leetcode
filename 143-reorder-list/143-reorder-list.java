/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode head1 = head;
        Deque<Integer> dq = new ArrayDeque<Integer>();
        while(head1!=null)
        {
            dq.push(head1.val);
            head1=head1.next;
        }
        
        for(int i=1;dq.size()>0;i++)
        {
            if(i%2==0)
            {
               
                head.val = dq.getFirst();
                dq.removeFirst();
                 //System.out.println(head.val);
            }
             else
            {    
                head.val = dq.getLast();
                 dq.removeLast();
                // System.out.println(head.val);
            }
            head=head.next;
        }
    }
}
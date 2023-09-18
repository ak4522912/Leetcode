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
    public ListNode deleteDuplicates(ListNode head) {
        if(head== null) return head;
        ListNode A = head;
        ListNode prev = A;
        A=A.next;
        while( A != null )
        {
            if(A.val==prev.val)
            {
                prev.next = A.next;
            }
            else{
                prev = prev.next;

            }
                            A = A.next;
        }
        return head;
    }
}
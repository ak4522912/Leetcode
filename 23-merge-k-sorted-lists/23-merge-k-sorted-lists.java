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
import java.util.Arrays;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head1, head2;
      //  System.out.println(lists[0].val);
        if(lists.length>2)
        {
             head1 = mergeKLists(Arrays.copyOfRange(lists,0,lists.length/2));
             head2 = mergeKLists(Arrays.copyOfRange(lists,lists.length/2,lists.length));
        }  
       
       else if(lists.length==2)
       {
           head1 = lists[0];
           head2 = lists[1];
       }
        else if(lists.length==1){
            return lists[0];
        }
        else {return null;}
       //System.out.println(head1.val+","+head2.val);
            ListNode head3 = new ListNode();
        ListNode res = head3;
            while(head1!=null|head2!=null)
            {   if (head1==null)
            {
                 head3.next = new ListNode(head2.val,null);
                    head2=head2.next;
            }
                else if(head2==null)
                {
                    head3.next = new ListNode(head1.val,null);
                    head1=head1.next;
                }
             else if(head2.val<=head1.val)
             {
                 head3.next = new ListNode(head2.val,null);
                    head2=head2.next;
             }
                else{
                head3.next = new ListNode(head1.val,null);
                    head1=head1.next;
            }
             head3= head3.next;
            // System.out.println("Head3 val"+head3.val);
           
    }
         return res.next;
}}
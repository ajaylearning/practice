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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
        return null;
        else if(l1 ==null && l2 !=null)
        return l2;
        else if(l1!= null && l2== null)
        return l1;

        ListNode sum = new ListNode(0);
        ListNode s=sum;
        int carry=0;
        while(l1!=null && l2!= null){
            int digit = l1.val +l2.val+carry;
             carry = digit/10;
            int rem= digit%10;
            ListNode d= new ListNode(rem);
            s.next=d;
            s=s.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!= null){
            int digit = l1.val +carry;
             carry = digit/10;
            int rem= digit%10;
            ListNode d= new ListNode(rem);
            s.next=d;
            s=s.next;
            l1=l1.next;
        }
        while(l2!= null){
             int digit = l2.val+carry;
             carry = digit/10;
            int rem= digit%10;
            ListNode d= new ListNode(rem);
            s.next=d;
            s=s.next;
            l2=l2.next;
        }
         if( carry!=0){
            ListNode d= new ListNode(carry);
            s.next=d;
        }

        return sum.next;
       
    }
}
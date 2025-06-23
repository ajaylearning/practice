/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1= headA;
        ListNode temp2= headB;

        int lenA = lenOfLL(temp1);
        int lenB = lenOfLL(temp2);
        
        if(lenA>lenB){
            temp1 = moveHead(temp1, lenA-lenB);
        }
        else if(lenB> lenA){
            temp2= moveHead(temp2, lenB-lenA);
        }
        while(temp1 !=null && temp2 != null){
            if(temp1 == temp2)
                return temp1;
            temp1=temp1.next;
            temp2= temp2.next;
        }
        return null;
    }
    public int lenOfLL(ListNode  temp){
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public ListNode moveHead(ListNode temp, int len){
        while(len>0){
            temp=temp.next;
            len--;
        }
        return temp;
    }
}
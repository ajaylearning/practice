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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k== 0)
            return head;
        int lenLL = lenOfLL(head);
        ListNode temp= head;
        if(k%lenLL ==0) return head;
        for(int i=0;i<lenLL-(k%lenLL)-1;i++){
            temp=temp.next;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        temp=newHead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return newHead;
    }
    private int lenOfLL(ListNode temp){
        int count=0;
        while(temp!= null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
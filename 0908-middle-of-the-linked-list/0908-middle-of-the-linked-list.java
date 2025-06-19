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
    public ListNode middleNode(ListNode head) {
        ListNode twoNode = head;
        ListNode oneNode= head;
        while(twoNode!= null && twoNode.next!= null){
            twoNode= twoNode.next.next;
            oneNode = oneNode.next;
        }
        return oneNode;
    }
}
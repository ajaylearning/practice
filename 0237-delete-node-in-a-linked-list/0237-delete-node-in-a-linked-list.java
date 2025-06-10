/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode currNode= node;
        currNode= currNode.next;
        node.val=currNode.val;
        node.next=currNode.next;
    }
}
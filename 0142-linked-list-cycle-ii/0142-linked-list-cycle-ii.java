/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        HashMap<ListNode, Integer> count = new HashMap<>();
        ListNode temp= head;
        ListNode temp2= head;
        while(temp != null ){
            if(count.containsKey(temp))
                return temp;
            else{
                count.put(temp,1);
                temp=temp.next;
            }
        }
        return null;
        
    }
}
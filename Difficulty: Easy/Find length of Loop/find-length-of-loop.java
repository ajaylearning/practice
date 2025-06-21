/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        if(head== null || head.next== null)
            return 0;
        Node temp1= head;
        Node temp2 = head;
        while(temp2!= null && temp2.next!= null){
            temp1= temp1.next;
            temp2=temp2.next.next;
            if(temp1== temp2){
                int count =1;
                temp2= temp2.next;
                while(temp1 != temp2){
                    count++;
                    temp2=temp2.next;
                }
                return count;
            }
        }
        return 0;
        
    }
}
/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head == null )
        return head;
        if(x==1)
        return head.next;
        Node prev = null;
        Node temp = head;
        int count = 1;
        while(temp!=null){
            
            if(count==x){
                 prev.next =temp.next;
            }
           prev= temp;
           temp=temp.next;
           count++;
            
        }
        return head;
        
    }
}
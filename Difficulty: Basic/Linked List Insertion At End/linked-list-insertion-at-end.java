/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if(head == null)
            return newNode;
        Node mover = head;
        while(mover.next != null){
            mover=mover.next;
        }
        
        mover.next= newNode;
        return head;
        
    }
}
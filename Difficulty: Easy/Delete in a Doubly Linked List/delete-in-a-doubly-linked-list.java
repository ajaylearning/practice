/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head== null)return head;
        Node temp= head;
        int count =0;
        while(temp!= null){
            count++;
            if(count==x){
                if(temp.next == null){
                    Node prevNode = temp.prev;
                    prevNode.next= null;
                    temp.prev= null;
                    return head;
                }
                else if(temp.prev == null){
                    Node nextNode = temp.next;
                    nextNode.prev= null;
                    temp.next= null;
                    return nextNode;
                }
                else{
                Node frontNode = temp.next;
                Node prevNode =temp.prev;
                
                frontNode.prev = prevNode;
                prevNode.next= frontNode;
            
                temp.next= null;
                temp.prev = null;
                return head;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}
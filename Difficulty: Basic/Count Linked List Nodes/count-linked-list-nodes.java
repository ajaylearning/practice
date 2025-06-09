/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node mover= head;
        int count=0;
        while(mover!= null){
            count++;
            mover= mover.next;
        }
        return count;
    }
}
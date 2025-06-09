/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        Node mover= head;
        int count=1;
        while(mover !=null){
            if(count == index)
            return mover.data;
            mover=mover.next;
            count++;
        }
        
        return -1;
    }
}
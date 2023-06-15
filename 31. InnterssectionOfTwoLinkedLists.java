/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Node temp = firstHead;
        Node temp1 = secondHead;

        while(temp != temp1)
        {
            temp = temp == null? secondHead: temp.next;
            temp1 = temp1 == null? firstHead: temp1.next;
        }

        return temp.data;
    }
}

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
    public static Node firstNode(Node head) {
        // Write your code here.
        Node tort = head;
        Node hare = head;

        while(hare != null && hare.next != null)
        {
            hare = hare.next.next;
            tort = tort.next;
            if(hare == tort)
            {
                tort = head;

                while(hare != tort)
                {
                    hare = hare.next;
                    tort = tort.next;
                }

                return tort;
            }
        }

        return null;
    }
}

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
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(k == 0)
            return head;
        Node ans;
        Node temp = head;
        Node real = head;
        Node test = head;
        int size = 0;
        while(test != null)
        {
            size ++;
            test = test.next;
        }

        k = k % size;
        if(k == 0)
            return head;
        while(k != 0)
        {
            temp = temp.next;
            k --;
        }

        while(temp.next != null)
        {
            real = real.next;
            temp = temp.next;
        }
        ans = real.next;
        temp.next = head;
        real.next = null;

        return ans;
    }
}

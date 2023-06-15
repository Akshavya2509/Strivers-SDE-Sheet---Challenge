import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> temp = node;
        while(temp.next != null)
        {
            Integer d = temp.data;
            temp.data = temp.next.data;
            temp.next.data = d;

            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
	}
}

import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		// Write your code here.
        if(head1 == null)
        {
            return head2;
        }

        if(head2 == null)
        {
            return head1;
        }
        
        LinkedListNode result;

        if(head1.data < head2.data)
        {
            result = head1;
            result.next = sortTwoLists(head1.next, head2);
        }

        else
        {
            result = head2;
            result.next =  sortTwoLists(head1, head2.next);
        }

        return result;
	}
}

public class Solution {

    public static boolean detectCycle(Node head) {
        Node hare = head;
        Node tort = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tort = tort.next;

            if (hare == tort) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle detected
    }
}

import java.util.*;

public class Solution {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                arr.set(count, arr.get(i));
                count++;
            }
        }

        return count;
    }
}

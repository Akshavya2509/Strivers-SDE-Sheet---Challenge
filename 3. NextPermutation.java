import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        if (permutation.size() <= 1) {
            return permutation;
        }

        ArrayList<Integer> nextPerm = new ArrayList<>(permutation);
        int n = nextPerm.size();

        // Find the first decreasing element from the right
        int i = n - 2;
        while (i >= 0 && nextPerm.get(i) >= nextPerm.get(i + 1)) {
            i--;
        }

        if (i >= 0) {
            // Find the smallest element greater than nextPerm.get(i)
            int j = n - 1;
            while (nextPerm.get(j) <= nextPerm.get(i)) {
                j--;
            }

            // Swap the elements at indices i and j
            Collections.swap(nextPerm, i, j);
        }

        // Reverse the remaining elements
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            Collections.swap(nextPerm, left, right);
            left++;
            right--;
        }

        return nextPerm;
    }
}

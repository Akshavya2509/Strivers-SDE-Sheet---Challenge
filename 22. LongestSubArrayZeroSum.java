import java.io.*;
import java.util.*;

public class Solution {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }

}

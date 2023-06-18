import java.util.*;
public class Solution {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
    
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);  // Store 0th index XOR as 0 in m

        int cpx = 0;
        int c = 0;

        for (int i = 0; i < arr.size(); i++) {
            cpx ^= arr.get(i);
			// XOR with target gives the remaining value required to obtain tht target
            int h = cpx ^ x;
            if (m.containsKey(h)) {
                c += m.get(h);
            }

            m.put(cpx, m.getOrDefault(cpx, 0) + 1);
        }

        return c;
    }
}

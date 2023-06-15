import java.io.*;
import java.util.*;

public class Solution {
    static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }
    }

    public static String fourSum(List<Integer> arr, int target, int n) {
        // Write your code here.
        Map<Long, Pair<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long sum = arr.get(i) + arr.get(j);
                long find = target - sum;
                if (map.containsKey(find)) {
                    Pair<Integer, Integer> pair = map.get(find);
                    if (pair.getFirst() != i && pair.getSecond() != j) {
                        return "Yes";
                    }
                }
                map.put(sum, new Pair<>(i, j));
            }
        }

        return "No";
    }
}

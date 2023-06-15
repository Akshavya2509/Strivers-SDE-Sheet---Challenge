import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int binarySearch(ArrayList<Integer> sortedArr, int num) {
        int start = 0;
        int end = sortedArr.size() - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (sortedArr.get(mid) > num) {
                if (mid == 0) {
                    return sortedArr.size();
                } else if (sortedArr.get(mid - 1) <= num) {
                    return sortedArr.size() - mid;
                } else {
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }
        
        return 0;
    }
    
    public static int reversePairs(ArrayList<Integer> arr) {
        int ans = 0;
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.add(arr.get(0));
        
        for (int i = 1; i < arr.size(); i++) {
            ans += binarySearch(sortedArr, 2 * arr.get(i));
            
            int index = Collections.binarySearch(sortedArr, arr.get(i));
            if (index < 0) {
                index = -index - 1;
            }
            sortedArr.add(index, arr.get(i));
        }
        
        return ans;
    }
}

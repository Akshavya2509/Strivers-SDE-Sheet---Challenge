import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] nums, int N) {
        // Write your code here.
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);

        int max = 1;
        int count = 1;

        for(int i = 1; i < nums.length; i ++){
            if(nums[i] != nums[i - 1])
                if(nums[i] == nums[i - 1] + 1)
                    count ++;

            else{
                max = Math.max(count, max);
                count = 1;
            }
        }

        return Math.max(max, count);
    }
}

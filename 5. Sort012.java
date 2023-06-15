import java.util.* ;
import java.io.*; 
public class Solution 
{
       public static void sort012(int[] arr)
    {
        //Write your code here
        int nums[] = new int[3];

        for(int i = 0; i < arr.length; i ++)
            nums[arr[i]] ++;
        int j = 0;
        for(int i = 0; i < arr.length; i ++)
        {
            if(nums[j] == 0){
                j ++;
                i --;
                continue;
            }
            arr[i] = j;
            nums[j] --;
        }
    }
}

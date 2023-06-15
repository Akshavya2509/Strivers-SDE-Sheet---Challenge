import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int max = 0;
        for(int i : arr){
            max = (int) Math.max(max, i);
        }
        int flag[] = new int[max + 1];

        for(int i = 0; i < arr.size(); i ++){
            if(flag[arr.get(i)] >= 1)
                return arr.get(i);
            else flag[arr.get(i)] ++;
        }

        return 0;
    }
}

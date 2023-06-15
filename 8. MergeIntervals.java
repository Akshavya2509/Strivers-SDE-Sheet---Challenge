import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int amnt = 0;
        int max = 0;
        for(int i = 1; i < prices.size(); i ++)
        {
            if(prices.get(i) > min){
                amnt = prices.get(i) - min;
            }

            else if(prices.get(i) < min){
                min = prices.get(i);
                amnt = 0;
            }
            if(max < amnt)
                max = amnt;
            
        }

        return max;
    }
}

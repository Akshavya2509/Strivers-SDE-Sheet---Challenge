import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i : arr)
        {
            if(m.containsKey(i))
                m.put(i, m.get(i) + 1);
            else
                m.put(i, 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> map : m.entrySet())
        {
            if(map.getValue() > arr.size() / 3)
                ans.add(map.getKey());
        }

        return ans;
    }
}

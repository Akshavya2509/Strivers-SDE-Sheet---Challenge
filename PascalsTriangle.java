import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
		
		for(int i = 0; i < n; i ++)
		{
			ArrayList<Long> a = new ArrayList<>();
			for(int j = 0; j <= i; j ++)
			{
				if(i == 0 || j == 0 || j == i)
					a.add(1l);

				else
					a.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
			}

			ans.add(a);
		}

		return ans;
	}
}

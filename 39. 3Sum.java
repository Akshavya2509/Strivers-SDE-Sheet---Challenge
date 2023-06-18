import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Arrays.sort(arr);
	    // Write your code here.
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i = 0; i < arr.length; i ++)
		{
			if (i > 0 && arr[i] == arr[i - 1]) 
                continue;
            
			int p1 = i + 1;
			int p2 = arr.length - 1;
			int k = K - arr[i];
			while(p1 < p2)
			{
				if(arr[p1] + arr[p2] > k)
					p2 --;

				else if(arr[p1] + arr[p2] < k)
					p1 ++;

				else{
					ArrayList<Integer> a = new ArrayList<>();
					a.add(arr[i]);
					a.add(arr[p1]);
					a.add(arr[p2]);

					ans.add(a);

					while(p1 < p2 && a.get(1) == arr[p1]) p1 ++;
					while(p1 < p2 && a.get(2) == arr[p2]) p2 --;
				}
			}
		}

		return ans;
	}
}

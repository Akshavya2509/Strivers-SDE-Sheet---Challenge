import java.util.* ;
import java.io.*; 
public class Solution {
	static int count;
	public static int find(int idx1, int idx2, int m, int n, int[][] dp)
	{
		if(idx1 == m - 1 && idx2 == n - 1)
			return 1;
		if(idx1 >= m || idx2 >= n)
			return 0;
		if(dp[idx1][idx2] != 0)
		{
			return dp[idx1][idx2];
		}
		
		
		int right = find(idx1 + 1, idx2, m, n, dp);
		int down = find(idx1, idx2 + 1, m, n, dp);

		return dp[idx1][idx2] = right + down;
	}
	public static int uniquePaths(int m, int n) {
		if(m == 1 && n == 1)
			return 1;

		int dp[][] = new int[m][n];
		// Write your code here.
		int count = find(0, 0, m, n, dp);
		return count;
	}
}

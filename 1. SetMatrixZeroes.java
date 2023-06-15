import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int col[] = new int[matrix[0].length];
        int row[] = new int[matrix.length];

        for(int i = 0; i < matrix.length; i ++)
        {
            for(int j = 0; j < matrix[0].length; j ++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i ++)
        {
            for(int j = 0; j < matrix[0].length; j ++)
            {
                if(row[i] == 1 || col[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }

}

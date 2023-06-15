import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.get(0).size();
        int idx = 0;
        for(int i = 0; i < mat.size(); i ++)
        {
            if(target <= mat.get(i).get(n - 1)){
                idx = i;
                break;}
        }

        for(int i = 0; i < n; i ++)
        {
            if(target == mat.get(idx).get(i))
                return true;
        }

        return false;
    }
}

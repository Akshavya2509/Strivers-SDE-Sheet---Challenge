import java.util.*;

public class Solution {

    public static long CrossSum(int[] arr, int si, int mid, int ei) {
        long sumLft = 0, sumRght = 0, max = Long.MIN_VALUE;

        for (int i = mid; i >= si; i--) {
            sumLft += arr[i];
            if (sumLft > max) {
                max = sumLft;
            }
        }

        sumLft = max;
        max = Long.MIN_VALUE;

        for (int i = mid + 1; i <= ei; i++) {
            sumRght += arr[i];
            if (sumRght > max) {
                max = sumRght;
            }
        }

        sumRght = max;

        return sumLft + sumRght;
    }


    public static long maxSubArrSum(int[] arr, int si, int ei) {
        if (si == ei) {
            return arr[ei];
        }

        int mid = si + (ei - si) / 2;
        long LftSdSum = maxSubArrSum(arr, si, mid);
        long RgtSdSum = maxSubArrSum(arr, mid + 1, ei);
        long CrssSum = CrossSum(arr, si, mid, ei);

        long max = Math.max(RgtSdSum, LftSdSum);

        return Math.max(max, CrssSum);
    }


    public static long maxSubarraySum(int[] arr, int n) {
        if (arr == null || n == 0) {
            return 0;
        }

        long ans = maxSubArrSum(arr, 0, n - 1);
        return Math.max(ans, 0);
    }

    public static void main(String[] args) {
        int[] arr = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};
        int n = arr.length;
        long result = maxSubarraySum(arr, n);
        System.out.println(result);  // Output: -43
    }
}

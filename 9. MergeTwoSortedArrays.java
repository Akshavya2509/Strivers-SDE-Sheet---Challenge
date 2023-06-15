import java.util.*;
 public class Solution {
//     public static int[] mergeSort(int[] array) {
//         // Base case
//         if (array.length <= 1) {
//             return array;
//         }

//         // Divide the array into two halves
//         int mid = array.length / 2;
//         int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, mid));
//         int[] rightArray = mergeSort(Arrays.copyOfRange(array, mid, array.length));

//         // Merge the two halves
//         return merge(leftArray, rightArray);
//     }

//     private static int[] merge(int[] leftArray, int[] rightArray) {
//         // Create a new array to store the merged results
//         int[] mergedArray = new int[leftArray.length + rightArray.length];

//         // Initialize the pointers for the two arrays
//         int leftIndex = 0;
//         int rightIndex = 0;

//         // Iterate through the two arrays and merge the elements
//         for (int i = 0; i < mergedArray.length; i++) {
//             if (leftIndex == leftArray.length) {
//                 // If the left array is exhausted, copy the remaining elements from the right array
//                 mergedArray[i] = rightArray[rightIndex++];
//             } else if (rightIndex == rightArray.length) {
//                 // If the right array is exhausted, copy the remaining elements from the left array
//                 mergedArray[i] = leftArray[leftIndex++];
//             } else {
//                 // Compare the elements from the two arrays and copy the smaller element
//                 if (leftArray[leftIndex] < rightArray[rightIndex]) {
//                     mergedArray[i] = leftArray[leftIndex++];
//                 } else {
//                     mergedArray[i] = rightArray[rightIndex++];
//                 }
//             }
//         }

//         // Return the merged array
//         return mergedArray;
//     }

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.

        int new1[] = new int[m + n];

        System.arraycopy(arr1, 0, new1, 0, m);
        System.arraycopy(arr2, 0, new1, m, n);
        System.arraycopy(new1, 0, arr1, 0, arr1.length);

        Arrays.sort(arr1);

        return arr1;
    }
}

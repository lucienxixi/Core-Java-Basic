package assignment1;

// assignment1: question 14

import java.util.Arrays;

public class Solution1 {
    public int[] merge(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < result.length; k++) {
            if (i == arr1.length) {
                result[k] = arr2[j];
                j++;
            } else if (j == arr2.length) {
                result[k] = arr1[i];
                i++;
            } else if (arr1[i] >= arr2[j]) {
                result[k] = arr2[j];
                j++;
            } else {
                result[k] = arr1[i];
                i++;
            }
        }

        return result;
    }
}

// Day 33: Unit 3 - Searching & Sorting
// Topic: Merge Sort (Divide and Conquer)

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Before: " + Arrays.toString(nums));
        sort(nums, 0, nums.length - 1);
        System.out.println("After:  " + Arrays.toString(nums));
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Divide: Split the array into two halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Conquer: Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++; k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++; k++;
        }
    }
}

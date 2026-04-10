// Day 30: Unit 3 - Searching & Sorting
// Topic: Bubble Sort (The Foundation of Sorting)

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Before Sorting: " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("After Sorting:  " + Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        
        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Track if a swap happened to optimize (if no swaps, it's already sorted!)
            boolean swapped = false;

            // Inner loop for adjacent comparisons
            // (n-i-1) because the last 'i' elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}

// Day 31: Unit 3 - Searching & Sorting
// Topic: Selection Sort (Finding the Minimum)

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {29, 10, 14, 37, 13};
        
        System.out.println("Before: " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("After:  " + Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        int n = nums.length;

        // One by one move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Check the rest of the array to find the true minimum
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}

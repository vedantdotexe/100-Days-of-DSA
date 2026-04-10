// Day 32: Unit 3 - Searching & Sorting
// Topic: Insertion Sort (The Card Player's Method)

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {12, 11, 13, 5, 6};
        
        System.out.println("Before: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("After:  " + Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i]; // The element we are currently positioning
            int j = i - 1;

            // Move elements of nums[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            // Place the key in its correct "hole"
            nums[j + 1] = key;
        }
    }
}

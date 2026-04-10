// Day 27: Unit 3 - Searching & Sorting
// Topic: Find First and Last Position (Modified Binary Search)

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] result = searchRange(nums, target);
        System.out.println("Range: " + Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the first occurrence
        result[0] = findIndex(nums, target, true);
        
        // If the first one exists, find the last one
        if (result[0] != -1) {
            result[1] = findIndex(nums, target, false);
        }
        
        return result;
    }

    private static int findIndex(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid; // Potential answer found
                if (isFirst) {
                    right = mid - 1; // Keep looking left for the 'First'
                } else {
                    left = mid + 1;  // Keep looking right for the 'Last'
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}

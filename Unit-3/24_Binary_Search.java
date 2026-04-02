// Day 24: Unit 3 - Searching & Sorting
// Topic: Binary Search (Iterative Approach)

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; // Must be sorted!
        int target = 23;

        int result = search(nums, target);
        
        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // 1. Check if target is at mid
            if (nums[mid] == target) {
                return mid;
            }

            // 2. If target is greater, ignore left half
            if (nums[mid] < target) {
                left = mid + 1;
            } 
            // 3. If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}

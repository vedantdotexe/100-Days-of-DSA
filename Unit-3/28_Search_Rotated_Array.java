// Day 28: Unit 3 - Searching & Sorting
// Topic: Search in Rotated Sorted Array (Logic Pivot)

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Step 1: Identify which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Target is in the sorted left half
                } else {
                    left = mid + 1;  // Target is in the right half
                }
            } else {
                // Right side is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;  // Target is in the sorted right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return -1;
    }
}

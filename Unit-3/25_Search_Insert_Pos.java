// Day 25: Unit 3 - Searching & Sorting
// Topic: Search Insert Position (Binary Search Variation)

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;  // Should return 2
        int target2 = 2; // Should return 1 (where it would be inserted)

        System.out.println("Index for 5: " + searchInsert(nums, target));
        System.out.println("Index for 2: " + searchInsert(nums, target2));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Look in the right half
            } else {
                right = mid - 1; // Look in the left half
            }
        }

        // If not found, 'left' is the insertion index
        return left;
    }
}

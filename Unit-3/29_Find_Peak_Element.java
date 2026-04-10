// Day 29: Unit 3 - Searching & Sorting
// Topic: Find Peak Element (Binary Search on Answer)

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1}; // Index 2 (value 3) is a peak
        
        int peakIndex = findPeak(nums);
        System.out.println("Peak found at index: " + peakIndex);
    }

    public static int findPeak(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the element to the right is greater, we are on an upward slope.
            // The peak must be on the right side.
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } 
            // Otherwise, we are on a downward slope.
            // The peak is either 'mid' or to the left.
            else {
                right = mid;
            }
        }

        // When left == right, we've found a peak!
        return left;
    }
}

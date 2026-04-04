// Day 26: Unit 3 - Searching & Sorting
// Topic: Search a 2D Matrix (Virtual Binary Search)

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        System.out.println("Target " + target + " found: " + searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the whole matrix as a single sorted array
        int left = 0;
        int right = (rows * cols) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // This is the "Magic Math" to find the 2D coordinates
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

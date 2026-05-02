import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("Before: " + Arrays.toString(nums));
        
        quickSort(nums, 0, nums.length - 1);
        
        System.out.println("After:  " + Arrays.toString(nums));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get the partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // We pick the last element as the pivot
        int pivot = arr[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot to its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

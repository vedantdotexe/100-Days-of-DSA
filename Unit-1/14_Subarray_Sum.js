// Day 14: Finding sums of subarrays (size 3)
// March 12th - Using a simple "Sliding Frame" logic.

let scores = [1, 2, 3, 4, 5, 6];
let windowSize = 3;

function slidingWindowSum(arr, k) {
    console.log("Array: " + arr + " | Window Size: " + k);
    
    // We stop the loop early because the frame needs space to fit!
    // If we have 6 items and the frame is 3, the last frame starts at index 3.
    for (let i = 0; i <= arr.length - k; i++) {
        let currentSum = 0;

        // Inside the frame, add up the next 'k' numbers
        for (let j = 0; j < k; j++) {
            currentSum = currentSum + arr[i + j];
        }

        console.log("Frame starting at index " + i + " has a sum of: " + currentSum);
    }
}

slidingWindowSum(scores, windowSize);

// Complexity: O(n * k) - A bit slower because of the loop inside a loop.
// Tomorrow, we'll learn how to make this even faster!

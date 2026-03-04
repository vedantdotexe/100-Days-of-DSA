// Day 7: Rotating an array by K (The "Triple Reversal" Trick)
// I'm using a helper function to make the logic easier to read.

let leaderboard = ["Verstappen", "Norris", "Leclerc", "Hamilton", "Piastri"];
let k = 2; // We want to move the first 2 drivers to the back

// First, I'll write a simple function just to reverse any part of an array
function flipSection(arr, start, end) {
    while (start < end) {
        let temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

function rotateByK(arr, k) {
    // If k is bigger than the array (like k=12 on 5 items), 
    // we use % to find the actual needed shifts.
    k = k % arr.length;

    console.log("--- Starting Rotation by " + k + " ---");

    // Step 1: Flip the first 'k' elements
    console.log("Step 1: Reversing first " + k + " elements");
    flipSection(arr, 0, k - 1);
    console.log("Array is now: " + arr);

    // Step 2: Flip the rest of the array (from k to the end)
    console.log("Step 2: Reversing the remaining elements");
    flipSection(arr, k, arr.length - 1);
    console.log("Array is now: " + arr);

    // Step 3: Flip the WHOLE thing to put it in order
    console.log("Step 3: Reversing the entire array");
    flipSection(arr, 0, arr.length - 1);

    return arr;
}

console.log("Original Grid: " + leaderboard);
let result = rotateByK(leaderboard, k);
console.log("Final Result: " + result);

// Logic: We touched every element a couple of times, so it's O(n) Time.
// We didn't create a new array, so it's O(1) Space.

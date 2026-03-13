// Day 15: The "Fast" Sliding Window
// Final Day of Unit 1! Let's optimize the sum logic.

let numbers = [1, 2, 3, 4, 5, 6, 7, 8];
let k = 3; 

function fastSum(arr, k) {
    let currentWindowSum = 0;

    // 1. Calculate the sum of the VERY FIRST window
    for (let i = 0; i < k; i++) {
        currentWindowSum += arr[i];
    }
    console.log("First window sum: " + currentWindowSum);

    // 2. Now, slide the window across the rest of the array
    // We start 'i' at k because that's the "New Person" getting on the bus
    for (let i = k; i < arr.length; i++) {
        
        // Subtract the person who left (at the back of the bus)
        // Add the person who just joined (at the front of the bus)
        currentWindowSum = currentWindowSum - arr[i - k] + arr[i];
        
        console.log("Window slid! New sum: " + currentWindowSum);
    }
}

fastSum(numbers, k);

// Why this is better:
// Old way (Day 14): O(n * k) - Lots of re-adding.
// New way (Day 15): O(n) - We only look at each number once!

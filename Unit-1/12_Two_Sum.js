// Day 12: The Famous "Two Sum" Problem
// March 12th - Using the "Missing Piece" strategy.

let nums = [2, 7, 11, 15];
let target = 9;

function findTwoSum(arr, goal) {
    // This object is our "Memory" of people we've already met
    let memory = {};

    console.log("Looking for a pair that adds up to: " + goal);

    for (let i = 0; i < arr.length; i++) {
        let currentNumber = arr[i];
        
        // Step 1: Calculate the "Missing Piece" we need
        let missingPiece = goal - currentNumber;

        // Step 2: Check if we've seen that missing piece before
        if (memory[missingPiece] !== undefined) {
            console.log("Found it! We met " + missingPiece + " earlier.");
            // Return the index of the missing piece and the current index
            return [memory[missingPiece], i];
        }

        // Step 3: If we haven't seen it, save our current number and its index
        memory[currentNumber] = i;
        console.log("Haven't found a match for " + currentNumber + ". Saving it in memory.");
    }

    return "No match found";
}

let result = findTwoSum(nums, target);
console.log("The indices of the two numbers are: " + result);

// Time: O(n) - We only walk through the list once!
// Space: O(n) - We might store every number in our 'memory' object.

// Day 16: Unit 2 - String Manipulation
// Topic: Valid Palindrome (Two-Pointer Method)

let word = "racecar";

function isPalindrome(str) {
    // Step 1: Set up our two fingers (pointers)
    let start = 0;
    let end = str.length - 1;

    console.log("Checking if '" + str + "' is a palindrome...");

    // Step 2: Move toward the center
    while (start < end) {
        console.log("Comparing: " + str[start] + " and " + str[end]);

        // If characters at the two ends don't match, stop immediately
        if (str[start] !== str[end]) {
            return false;
        }

        // Move the fingers closer
        start++;
        end--;
    }

    // If we finish the loop, all characters matched!
    return true;
}

let result = isPalindrome(word);
console.log("Result: " + (result ? "Yes, it is!" : "No, it isn't."));

// Time Complexity: O(n) - We only look at each character once.
// Space Complexity: O(1) - We aren't creating a new string.

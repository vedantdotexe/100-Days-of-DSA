// Day 3: Finding the highest and lowest numbers
// I'm doing this manually instead of using Math.max() to understand the logic.

let scores = [45, 88, 23, 91, 54];

// I'll start by just picking the first number as my "current winner"
let max = scores[0];
let min = scores[0];

for (let i = 0; i < scores.length; i++) {
    // Let's see what the loop is looking at right now
    console.log("Checking number: " + scores[i]);

    if (scores[i] > max) {
        console.log("Found a new Max! Replacing " + max + " with " + scores[i]);
        max = scores[i];
    }

    if (scores[i] < min) {
        console.log("Found a new Min! Replacing " + min + " with " + scores[i]);
        min = scores[i];
    }
}

console.log("Final Results --- Max: " + max + " Min: " + min);

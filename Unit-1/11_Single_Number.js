//The Strategy:
//Imagine you have a bunch of labeled boxes.
//Every time you see a number, you put a tally mark in that number's box.
//At the end, you just look for the box that only has one mark.

// Day 11: Finding the "Single Number"
// March 8th - Back after a 3-day fever break.

let numbers = [4, 1, 2, 1, 2]; 

function findTheSingleOne(arr) {
    // This object acts like our tally sheet
    let tallySheet = {};

    // 1. Go through the list and mark how many times we see each number
    for (let i = 0; i < arr.length; i++) {
        let currentNum = arr[i];
        
        if (tallySheet[currentNum]) {
            // If we've seen it before, add 1 to the count
            tallySheet[currentNum] = tallySheet[currentNum] + 1;
        } else {
            // If it's the first time, start the count at 1
            tallySheet[currentNum] = 1;
        }
    }

    // 2. Now check the tally sheet for the number that only appeared once
    for (let property in tallySheet) {
        if (tallySheet[property] === 1) {
            return property;
        }
    }
}

console.log("The odd one out is: " + findTheSingleOne(numbers));

// Complexity: O(n) Time | O(n) Space (because of the tally object)

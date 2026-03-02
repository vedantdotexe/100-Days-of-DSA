// Day 5: Cleaning up duplicates in a sorted array
// I'm using two pointers so I don't have to create a new array.

let scores = [10, 10, 20, 30, 30, 30, 40, 50, 50]; 

function cleanDuplicates(arr) {
    if (arr.length === 0) return 0;

    // 'gatekeeper' tracks the last unique spot we've confirmed
    let gatekeeper = 0;

    // 'scout' looks at every single number in the list
    for (let scout = 1; scout < arr.length; scout++) {
        
        // If the scout finds a number that is DIFFERENT from the gatekeeper's...
        if (arr[scout] !== arr[gatekeeper]) {
            
            // Move the gatekeeper forward to the next empty slot
            gatekeeper = gatekeeper + 1;
            
            // Put the new unique number into that slot
            arr[gatekeeper] = arr[scout];
            
            console.log("New unique number " + arr[gatekeeper] + " moved to index " + gatekeeper);
        } else {
            console.log("Scout found a duplicate: " + arr[scout] + " (ignoring)");
        }
    }

    // Since index starts at 0, the count of unique items is gatekeeper + 1
    return gatekeeper + 1;
}

console.log("Original Array: " + scores);
let count = cleanDuplicates(scores);

// We slice the array just to show the clean part at the beginning
console.log("Cleaned section: " + scores.slice(0, count));
console.log("Number of unique items: " + count);

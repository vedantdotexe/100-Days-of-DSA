// Day 13: Finding common numbers in two arrays
// March 12th - Using the "Checklist" method.

let listA = [1, 2, 2, 1, 4];
let listB = [2, 2, 4, 3];

function findIntersection(arr1, arr2) {
    let checklist = {};
    let result = [];

    // Step 1: Put everyone from the first list onto our checklist
    for (let i = 0; i < arr1.length; i++) {
        let person = arr1[i];
        checklist[person] = true; 
        // We just mark it as 'true' to say "They are invited"
    }

    console.log("Checklist created from List A:", checklist);

    // Step 2: Check the second list against our checklist
    for (let j = 0; j < arr2.length; j++) {
        let guest = arr2[j];

        // If the guest is on our checklist...
        if (checklist[guest] === true) {
            // Add them to our final result
            result.push(guest);
            
            // Step 3: Crucial! Remove them from the checklist 
            // so we don't count the same person twice if they appear again.
            checklist[guest] = false; 
            
            console.log("Match found! Adding " + guest + " to the intersection.");
        }
    }

    return result;
}

let commonItems = findIntersection(listA, listB);
console.log("The common numbers are: " + commonItems);

// Time: O(n + m) - We look at each list exactly once.
// Space: O(n) - We stored the first list in an object.

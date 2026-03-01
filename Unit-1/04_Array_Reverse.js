// Day 4: Learning how to reverse an array manually
// I'm using the "Swap" method so I don't have to create a new array.

let drivers = ["Verstappen", "Norris", "Leclerc", "Hamilton"];

console.log("Original Grid: " + drivers);

function reverseMyArray(arr) {
    let start = 0;
    let end = arr.length - 1;

    // We keep swapping until the pointers meet in the middle
    while (start < end) {
        console.log("Swapping " + arr[start] + " with " + arr[end]);

        // The "Cup" logic: You need a third cup (temp) to swap juice between two cups
        let temp = arr[start]; 
        arr[start] = arr[end];
        arr[end] = temp;

        // Move the pointers
        start = start + 1;
        end = end - 1;
    }

    return arr;
}

let result = reverseMyArray(drivers);
console.log("Final Reversed Grid: " + result);

// Logic: This is O(n) because we touch the elements, 
// but it's efficient because we didn't use extra memory!

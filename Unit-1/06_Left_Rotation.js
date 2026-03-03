// Day 6: Rotating the list to the left by 1 position
// Think of this as the lead car going to the back of the pack.

let racers = ["Verstappen", "Norris", "Leclerc", "Hamilton", "Piastri"];

console.log("Starting Grid: " + racers);

function rotateLeftByOne(arr) {
    if (arr.length <= 1) return arr;

    // Step 1: "Save" the first person before they get overwritten
    let leadCar = arr[0];
    console.log("The lead car " + leadCar + " is moving to the back...");

    // Step 2: Shift everyone else forward by 1 spot
    // We start at 0 and pull the person from the NEXT spot (i + 1)
    for (let i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
        console.log("Position " + i + " is now " + arr[i]);
    }

    // Step 3: Now that everyone moved up, the last spot is "open"
    // We put the original lead car there.
    arr[arr.length - 1] = leadCar;

    return arr;
}

let newGrid = rotateLeftByOne(racers);
console.log("Final Grid after Rotation: " + newGrid);

// Logic Check:
// Every element moved once, so it's O(n) Time.
// We only used one 'leadCar' variable, so it's O(1) Space.

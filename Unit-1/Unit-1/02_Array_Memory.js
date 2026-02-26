// Day 2: Array Methods and Memory 
// Comparing O(1) vs O(n) when adding items to an array

const pitLane = ["Hamilton", "Verstappen", "Leclerc"];
console.log("Initial Pit Lane:", pitLane);

// --- PUSH: Adding to the end ---
// Time Complexity: O(1) Constant Time
// It's fast because the computer just tacks it onto the end. No other items move.
pitLane.push("Norris");
console.log("After Push (End):", pitLane);


// --- UNSHIFT: Adding to the front ---
// Time Complexity: O(n) Linear Time
// It's slow! To put "Sainz" at index 0, the computer has to shift Hamilton to index 1, 
// Verstappen to index 2, and so on. Every single item moves.
pitLane.unshift("Sainz");
console.log("After Unshift (Front):", pitLane);


// Takeaway for MERN apps: 
// If an array has 1 million users, using .unshift() will force the server to re-index 1 million items.
//Using .push() is instant.

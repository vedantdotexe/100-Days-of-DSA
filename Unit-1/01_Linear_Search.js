/**
 * UNIT 1: Complexity & Array Fundamentals
 * Day 1: Understanding O(n) through Linear Search
 */

// Problem: Given an array of Red Bull parts, find the 'Engine'.
const carParts = ["Front Wing", "Tyres", "Engine", "Rear Wing", "Sidepod"];

function findComponent(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        // This loop runs 'n' times in the worst case
        if (arr[i] === target) {
            return `Found ${target} at Index ${i}`;
        }
    }
    return "Component not found.";
}

console.log(findComponent(carParts, "Engine"));

/* ANALYSIS:
   Time Complexity: O(n) - We might have to check every element.
   Space Complexity: O(1) - We aren't creating new data structures.
*/

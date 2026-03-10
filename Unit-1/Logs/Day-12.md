### 🟢 Day 12: March 11, 2026
**Topic:** Two Sum (Hash Map / Object Lookup)
**Vibe:** 🎯 Precision Pairing

Today I tackled "Two Sum," probably the most iconic DSA problem. Building on yesterday's Frequency Map logic, I realized that I don't need to compare every number to every other number (which would be a slow O(n^2) loop).

The "Aha!" moment was the "Missing Piece" logic. For every number I encounter, I calculate what its partner *should* be to hit the target. Then, I just check my memory (an Object) to see if I’ve seen that partner before. This keeps the performance at O(n). It’s a great example of how "remembering" past data can make your current code much faster.

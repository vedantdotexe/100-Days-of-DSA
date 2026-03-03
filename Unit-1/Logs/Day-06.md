### 🟢 Day 6: March 3, 2026
**Topic:** Left Rotation (Manual Shift)
**Vibe:** 🔄 The Pit Stop Shift

Today was about moving data in a circle. I implemented a Left Rotation by 1, which basically takes the first element and moves it to the back while everyone else moves up a spot.

The "Aha!" moment was realizing that to shift things left, I had to physically pull the "next" element into the "current" spot. It’s a classic O(n) operation because every single person in the line has to move. While I could use built-in methods like shift() and push(), doing it with a for-loop helped me understand how memory is actually overwritten during a shift. It’s the perfect foundation for more complex rotation problems I’ll face later.

### 🟡 Day 3: February 27, 2026
**Topic:** Finding Max/Min Values (Manual Logic)
**Vibe:** 🏁 Qualifying Rounds

Today was a lesson in logic over shortcuts. While it would have been easy to just use a built-in function like Math.max, I wanted to manually write the traversal to really understand how the computer finds the "best" or "worst" value in a set. I used what I call the "Notepad" logic: you assume the first item in the array is the leader, and then you compare every single other item against it one by one. If a new number is bigger (or smaller), you update your notepad and keep moving.

The real "Aha!" moment was realizing the efficiency of a single-pass solution. By checking for both the maximum and the minimum values inside the same for loop, I managed to do double the work without increasing the complexity beyond O(n). It’s a simple but powerful way to handle data analysis, and it's exactly how apps find the cheapest product or the fastest lap in a race. Seeing the values update in real-time made the logic feel much more physical and less like just lines of code.

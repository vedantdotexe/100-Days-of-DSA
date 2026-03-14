### 🟢 Day 17: March 14, 2026
**Topic:** Valid Anagram (Frequency Array)
**Language:** Java ☕
**Vibe:** 🧠 Thinking in ASCII

Today I solved the Anagram problem. Since I'm using Java now, I learned a cool trick: subtracting characters. In Java, `s.charAt(i) - 'a'` gives the alphabetical index (0 for 'a', 1 for 'b', etc.).

Using an `int[26]` array is much more memory-efficient than using a full HashMap for simple lowercase string problems. It’s $O(n)$ time and $O(1)$ space because the array size (26) never changes.

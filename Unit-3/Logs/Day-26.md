### 🟢 Day 26: April 4, 2026
**Topic:** Search a 2D Matrix (Virtual Binary Search)
**Language:** Java ☕
**Vibe:** 📐 Dimensional Thinking

Today I learned how to search a 2D grid using the same Binary Search logic I used for arrays. The key was treating the matrix as a flattened 1D array. By using `matrix[index / cols][index % cols]`, I could map any 1D index back to its 2D row and column. This keeps the time complexity at a very fast O(log(m*n)).

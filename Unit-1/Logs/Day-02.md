### 🔵 Day 2: February 26, 2026
**Topic:** Array Methods & Memory Management
**Vibe:** 🏎️ High Performance

Today was all about looking under the hood of how JavaScript actually handles data. I spent time comparing push() and unshift() and discovered that they aren't just "different ways to add things"—they have a huge impact on performance. I learned that adding an item to the end of an array is an O(1) operation because it’s instant and doesn't bother anyone else. However, adding to the front with unshift() is O(n) because the computer has to move every single existing item back one spot to make room. 

The most interesting part was thinking about this in a real-world MERN app. If I have a database with a million users, using the wrong method could force my server to do a million extra moves for no reason. It’s a great lesson in writing code that doesn't just work, but stays fast as the project grows. I also got my 100-Days-of-DSA repository fully organized with a new roadmap and linked my Day 2 code in the README table.

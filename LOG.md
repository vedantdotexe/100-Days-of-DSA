# 📔 Daily Learning Journal
> This is my personal space for key notes, "Aha!" moments, and the daily grind.

---
### 🟢 Day 1: February 25, 2026
**Topic:** Linear Search & Big O Foundations
**Vibe:** 🏎️ The Starting Grid

Today was the official start of the engine. I spent the day getting my head around Big O Notation, which basically measures how "expensive" code becomes as data grows. I implemented a Linear Search, the most straightforward way to find something by checking every item one by one. I learned that this is called O(n) complexity because if I have a million items, I might have to take a million steps. 

The big "Aha!" moment for me was realizing that even a simple loop can become a massive bottleneck if the data gets too big. It's the first time I've really thought about code performance instead of just making it work. I also spent some time fixing up my GitHub profile with a Red Bull theme—it took some troubleshooting with the stats links, but I found a mirror server that looks great. Ready to see how arrays handle memory tomorrow.
### 🔵 Day 2: February 26, 2026
**Topic:** Array Methods & Memory Management
**Vibe:** 🏎️ High Performance

Today was all about looking under the hood of how JavaScript actually handles data. I spent time comparing push() and unshift() and discovered that they aren't just "different ways to add things"—they have a huge impact on performance. I learned that adding an item to the end of an array is an O(1) operation because it’s instant and doesn't bother anyone else. However, adding to the front with unshift() is O(n) because the computer has to move every single existing item back one spot to make room. 

The most interesting part was thinking about this in a real-world MERN app. If I have a database with a million users, using the wrong method could force my server to do a million extra moves for no reason. It’s a great lesson in writing code that doesn't just work, but stays fast as the project grows. I also got my 100-Days-of-DSA repository fully organized with a new roadmap and linked my Day 2 code in the README table.
- Formatting the README table took a second, but I got the Markdown links working.

**Tomorrow's Goal:** - Find the Max/Min value in an array without using `Math.max()`.

---

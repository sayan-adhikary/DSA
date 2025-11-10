# 🚀 Data Structures & Algorithms in Java  

This repository contains my **DSA journey in Java**, including theory, solved problems, and implementation of various concepts.  
All topics are structured module-wise for better readability and practical learning.  

---

## 📘 Table of Contents  
- [Array](#-array)  
- [Sorting](#-sorting)  
- [2D Array](#-2d-array)  
- [String](#-string)  
- [Bit Manipulation](#-bit-manipulation)  
- [OOPs Concept](#-oops-concept)  
- [Recursion](#-recursion)  
- [Divide & Conquer](#-divide--conquer)  
- [Backtracking](#-backtracking)  
- [ArrayList](#-arraylist)  
- [Linked List](#-linked-list)  
- [Double Linked List](#-double-linked-list)  

---

## 🔹 Array  
| Topics |
|--------|
| **Basic Operations (Create, Input, Output, Update)** |
| **Linear Search** |
| **Largest Number** |
| **Binary Search** |
| **Reverse an Array** |
| **Pairs in an Array** |
| **Print SubArray** |
| **Max Sum SubArray → (Brute Force, Prefix Sum, Kadane's Algorithm)** |
| **Trapping Rain Water** |
| **Buy & Sell Stock** |

### 📘 Assignments  
**1.5.1 Contains Duplicate**  
- Sort and check neighbors → `O(n log n)` time, `O(1)` space.  

**1.5.2 Search in Rotated Sorted Array**  
- Binary Search → `O(log n)`  

**1.5.3 Best Time to Buy & Sell Stock**  
- Max profit calculation  

**1.5.4 Trapping Rain Water**  
- Two pointer / prefix max method  

---

## 🔹 Sorting  
| Algorithm | Description |
|------------|-------------|
| **Bubble Sort** | Repeatedly swaps adjacent elements |
| **Selection Sort** | Selects the smallest element each pass |
| **Insertion Sort** | Builds sorted list one element at a time |
| **Counting Sort** | Works with integer keys only |
| **Inbuilt Sort** | `Arrays.sort(arr)` and `Collections.reverseOrder()` |

**Time Complexity:** `O(n log n)` (inbuilt sort)  

---

## 🔹 2D Array  
- Matrix Representation  
- Spiral Matrix Traversal  
- Diagonal Sum  
- Search in Sorted Matrix (Staircase Search)  

---

## 🔹 String  
- Input, Length, Concatenation  
- `charAt()`, `substring()`, `equals()`  
- **Q1:** Palindrome Check  
- **Q2:** Shortest Path (N, S, E, W)  
- **Q3:** Largest String (`"apple", "mango", "banana"` → Output: `"mango"`)  
- **Q4:** Convert to Title Case → `"hi, i am sayan"` → `"Hi, I Am Sayan"`  
- **Q5:** Character Compression → `"aaabbbcc"` → `"a3b3c2"`  

🔹 Using **StringBuilder** for optimized string manipulation.  

---

## 🔹 Bit Manipulation  
- Bitwise Operations: `&, |, ^, ~, <<, >>`  
- Get, Set, Clear, and Check i-th Bit  
- Count Set Bits  
- Binary Masks  
- Fast Exponentiation  

**Examples:**  
1. Odd or Even Check  
2. Power of Two Check  
3. Counting Set Bits  

---

## 🔹 OOPs Concept  
- Classes and Objects  
- Getters and Setters  
- Constructors and Copy Constructors  
- Inheritance  
- Method Overloading  
- Abstraction and Interfaces  
- `static` and `super` keywords  

---

## 🔹 Recursion  
- Function Calls and Stack Flow  
- Recursive Problem Solving  

**Examples:**  
1. Print `n → 1` (Decreasing Order)  
2. Print `1 → n` (Increasing Order)  
3. Factorial  
4. Sum of Natural Numbers  
5. Fibonacci Series  
6. Check if Array is Sorted  
7. First and Last Occurrence  
8. Power Functions  
9. Optimized Exponentiation  
10. Tiling Problem  
11. Remove Duplicates  
12. Friends Pairing  
13. Binary Strings without Consecutive 1’s  

---

## 🔹 Divide & Conquer  
- **8.1 Merge Sort**  
- **8.2 Quick Sort**  
- **8.3 Search in Rotated Sorted Array**  

---

## 🔹 Backtracking  
- **9.1 Basics**  
- **9.2 Find Subsets**  
- **9.3 Find Permutations**  
- **9.4 N-Queen Problem**  
- **9.5 Grid Ways**  
- **9.6 Grid with Constraints**  
- **9.7 Sudoku Solver**  

---

## 🔹 ArrayList  
- **10.1 ArrayList Basics**  
- **10.2 Reverse an ArrayList**  
- **10.3 Find Max in ArrayList**  
- **10.4 Swap Elements**  
- **10.5 Sort ArrayList**  
- **10.6 Multidimensional ArrayList**  

---

## 🔹 Linked List  
### Files  
- cycle.java  
- mergeLL.java  
- MergeLLFramework.java  
- zigzagLL.java  

### Key Learning Points  
1. Creating a Linked List in Java using a nested `Node` class.  
2. Basic operations:  
   - `addFirst()` Add node at beginning.  
   - `addLast()` Add node at end.  
   - `add(idx, data)` Add node at specific index.  
3. Removing nodes:  
   - `removeFirst()` Remove node from beginning.  
   - `removeLast()` Remove node from end.  
4. Searching elements:  
   - Iterative search (`itrSearch`)  
   - Recursive search (`recSearch`)  
5. Reversing the Linked List.  
6. Deleting the N-th node from the end.  
7. Finding the middle node using slow-fast pointers.  
8. Checking if the Linked List is palindrome.  
9. Maintaining `head`, `tail`, and `size` for efficiency.  
10. Node traversal and manipulation using `next`.  
11. Using static inner classes and encapsulation.  
12. Handling edge cases (empty and single-node list).  
13. Helper methods for clean and modular code.  
14. Operation complexities (mostly `O(n)`).  
15. Implementing `print()` method for debugging.  

---

## 🔹 Double Linked List  
### Files  
- DoubleLL.java  

### Key Learning Points  
1. Creating a Doubly Linked List with `prev` and `next` references.  
2. Basic operations:  
   - `addFirst()` Add node at beginning.  
   - `addLast()` Add node at end.  
   - `add(idx, data)` Add node at specific index.  
3. Removing nodes:  
   - `removeFirst()` Remove node from beginning.  
   - `removeLast()` Remove node from end.  
4. Searching elements:  
   - Iterative search (`itrSearch`)  
   - Recursive search (`recSearch`)  
5. Reversing the Doubly Linked List.  
6. Deleting the N-th node from end.  
7. Finding middle node using slow-fast pointers.  
8. Checking palindrome using both directions.  
9. Maintaining `head`, `tail`, and `size` efficiently.  
10. Traversal using both `next` and `prev`.  
11. Using inner static `Node` class for encapsulation.  
12. Handling edge cases (empty or single-node list).  
13. Organized helper methods for clarity.  
14. Time complexity of operations `O(n)`.  
15. Debugging with `print()` method.  

---

✨ **This repository is regularly updated as I continue improving in DSA using Java.**  
💡 Suggestions, contributions, and optimizations are always welcome.  

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
- [Stack](#-stack)
- [Queue](#-queue)
- [Greedy Algorithms](#-greedy-algorithms)
- [Binary Tree](#-binary-tree)
- [Hashing](#-hashing)

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
- **11.1 LinkedList.java**  
- **12.1 cycle.java**

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
- **12.2 DoubleLL.java**  
- **12.3 mergeLL.java**
- **12.4 MergeLLFramework.java**
- **12.5 zigzagLL.java**

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

## 🔹 Stack  
### 📁 Files  
- **13.1_stackArrayList.java**  
- **13.2_stackLinkedList.java**  
- **13.3_stackJavaCollection.java**  
- **13.4_pushBottom.java**  
- **13.5_reverseString.java**  
- **13.6_reverseStack.java**  
- **13.7_stockSpan.java**

---

### ⭐ Key Learning Points  

1. **Implementing Stack using ArrayList.**  
   - Push, Pop, Peek operations  
   - Dynamic resizing behavior  
   - Time Complexity: O(1) average

2. **Implementing Stack using LinkedList.**  
   - Node-based implementation  
   - Efficient insert/delete at head  
   - No size-limit issue  

3. **Using Java Collection Framework (`Stack<T>`).**  
   - Built-in `push()`, `pop()`, `peek()`  
   - Easy and reliable API usage  

4. **Push element at the bottom of a stack (`pushBottom`).**  
   - Achieved using recursion  
   - Demonstrates reversing call-stack  

5. **Reverse a String using Stack.**  
   - Step-by-step character push/pop  
   - Understanding LIFO behavior  

6. **Reverse a complete Stack using recursion.**  
   - Uses `pushBottom()` internally  
   - No extra stack required  

7. **Stock Span Problem.**  
   - Using stack to compute nearest greater element  
   - Time Complexity: O(n)  
   - Practical use-case in stock price analysis  

---

### 📌 Concepts Covered  
- Stack fundamentals (LIFO principle)  
- Recursion + Stack combination  
- Efficient element insertion/removal  
- Real-world problem solving (Stock Span)  
- Choosing best implementation (ArrayList vs LinkedList vs JCF)  

---

## 🔹 Queue  
### 📁 Files  
- **14.1_queueArray.java**  
- **14.2_queueCollection.java**

---

### ⭐ Key Learning Points  

1. **Implementing Queue using Array.**  
   - Front and Rear pointer logic  
   - Circular Queue concept  
   - Efficient enqueue & dequeue  
   - Handling overflow & underflow  
   - Time Complexity: O(1)  

2. **Queue using Java Collection Framework (JCF).**  
   - Using `Queue<T>` interface  
   - Implementations: `LinkedList`, `ArrayDeque`  
   - Built-in methods:  
     - `add()`, `offer()`  
     - `poll()`, `remove()`  
     - `peek()`, `element()`  

3. **Understanding FIFO (First In First Out) principle.**  
   - Real-world examples:  
     - Printer queue  
     - Customer waiting line  

4. **Benefits of Queue ADT.**  
   - Predictable processing order  
   - Great for BFS traversal  
   - Task scheduling & buffering  

5. **Comparison: Array Queue vs JCF Queue.**  
   - Array Queue → Manual control, more logic required  
   - JCF Queue → Flexible, optimized, high-level  

---

### 📌 Concepts Covered  
- Queue operations: Enqueue & Dequeue  
- Checking queue overflow and underflow  
- Circular queue implementation  
- Using built-in Queue for faster development  
- Practical understanding of FIFO behavior  

---

This module prepares you for classic queue-based problems like **BFS, Sliding Window, and the Blocking Queue pattern**.

---

## 🔹 Greedy Algorithms  
### 📁 Files  
- **15.1_ActivitySelection.java**  
- **15.2_ActivitySelectionUnsort.java**  
- **15.6_FractionalKnapsack.java**  
- **15.7_minAbsVal.java**  
- **15.8_maxLengthChain.java**  
- **15.9_indianCoin.java**  
- **15.10_jobSequenceProblem.java**  
- **15.11_chocolateProblem.java**

---

### ⭐ Key Learning Points  

1. **Activity Selection (Sorted & Unsorted Versions).**  
   - Select maximum number of non-overlapping activities  
   - Sort by *finish time* → Greedy choice  
   - Core idea: Always choose the activity that finishes first  
   - Time Complexity: O(n log n)  

2. **Fractional Knapsack Problem.**  
   - Items can be broken into fractions  
   - Choose items with highest *value/weight ratio*  
   - Time Complexity: O(n log n) due to sorting  
   - Demonstrates classic greedy optimization  

3. **Minimum Absolute Difference Pair (`minAbsVal`).**  
   - Sort array and find closest difference  
   - Greedy ensures minimal absolute distance  
   - Time Complexity: O(n log n)  

4. **Maximum Length of Pair Chain.**  
   - Similar to activity selection  
   - Choose pair that ends earliest  
   - Time Complexity: O(n log n)  

5. **Indian Coin Problem (Minimum Coins).**  
   - Choose largest denomination first  
   - Works because Indian currency is canonical  
   - Time Complexity: O(n) (for fixed set of denominations)  

6. **Job Sequencing with Deadlines.**  
   - Maximize profit within deadlines  
   - Sort jobs by profit (descending)  
   - Greedy slot assignment  
   - Time Complexity: O(n log n)  

7. **Chocolate Distribution Problem.**  
   - Minimize difference between max & min chocolates  
   - Sort → choose any window of size `m`  
   - Time Complexity: O(n log n)  

---

### 📌 Concepts Covered  
- Greedy choice property  
- Optimal substructure  
- Sorting-based greedy selection  
- Practical optimization problems  
- Real-world applications (scheduling, resource allocation)  
- Understanding when greedy works vs. when it fails  

---

This module builds strong intuition for **optimization and decision-making algorithms**, a foundation for advanced problem-solving in coding interviews and competitive programming.

---

## 🔹 Binary Tree  
### 📁 Files  
- **16.1_binaryTree.java**  
  - Preorder Traversal (Root → Left → Right)  
  - Inorder Traversal (Left → Root → Right)  
  - Postorder Traversal (Left → Right → Root)  
  - Level Order Traversal using **Queue (BFS – FIFO)**  

- **16.2_hightOfTree.java**  
  - Count Height of the Tree (Maximum Depth)  
  - Count Total Nodes  
  - Count Sum of All Node Values  

---

### ⭐ Key Learning Points  

1. **Understanding Binary Tree Structure**
   - Node class with `data`, `left`, and `right` references  
   - Recursive approach for most tree operations  

2. **Tree Traversals**
   - **Preorder** → Used for copying tree, prefix expressions  
   - **Inorder** → Used for BST sorted output  
   - **Postorder** → Used for deleting/freeing tree, postfix expressions  
   - **Level Order (BFS)** → Uses a queue to traverse level by level  

3. **Height of a Tree**
   - Height = longest path from root to leaf  
   - Recursive formula → `height = 1 + max(left, right)`  

4. **Counting Nodes**
   - Simple recursive counting  
   - Total nodes = nodes in left + nodes in right + 1  

5. **Summing Node Values**
   - Add all node values recursively  
   - Helps in tree-based sum problems  

6. **Using Queue for Level Order**
   - FIFO principle  
   - Visit nodes level by level  
   - Essential step for BFS traversal  

7. **Time Complexity**
   - Traversals → O(n)  
   - Height/Node Count/Sum → O(n)  

8. **Understanding Recursion in Trees**
   - Natural fit for tree data structures  
   - Every subtree is itself a tree  

---

### 📌 Concepts Covered  
- Binary Tree basics  
- DFS Traversals (Pre/In/Post)  
- BFS Traversal (Level Order)  
- Height, Node Count, Sum of Nodes  
- Recursive approaches for tree problems  

---

This module builds the foundation for advanced topics like **Binary Search Trees (BST), Tree Diameter, Lowest Common Ancestor, Balanced Trees, and Segment Trees**.

---

## 🔹 Hashing  
### 📁 Files  
- **23.1_HashMap.java**  
- **23.2_IterateHm.java**  
- **23.6_implementatioHM.java**  
- **23.11_Majority Element.java**  
- **23.12_validAnagram.java**  
- **23.14_hSetIterator.java**  
- **23.17_countDistinct.java**  
- **23.18_unionIntersection.java**  
- **23.19_itenary Ticket.java**  
- **23.20_largestSubarray.java**  
- **23.21_subarraySum.java**

---

### ⭐ Key Learning Points  

1. **HashMap Basics**  
   - Storing key-value pairs  
   - `put()`, `get()`, `containsKey()`, `remove()`  
   - Internal working → hashing + buckets  

2. **Iterating Through HashMap (`IterateHm`)**  
   - Using `keySet()`  
   - Using `entrySet()`  
   - Using `values()`  
   - Efficient traversal techniques  

3. **HashMap Implementation Logic (`implementatioHM`)**  
   - Understanding how hashing works  
   - Bucket arrays, linked lists, and rehashing  
   - Collision handling  
   - Load factor and resizing  

4. **Majority Element (HashMap approach)**  
   - Counting frequency of elements  
   - Identifying element that appears `> n/2` times  
   - Time Complexity: O(n)  

5. **Valid Anagram**  
   - Character frequency comparison  
   - HashMap / Array counting method  
   - Works for all ASCII/Unicode characters  

6. **HashSet Iterator**  
   - Iterating set elements  
   - Difference between HashMap and HashSet iteration  

7. **Counting Distinct Elements**  
   - Using `HashSet` to track unique values  
   - Time Complexity: O(n)  

8. **Union & Intersection of Arrays**  
   - Union → add all elements to a HashSet  
   - Intersection → check presence using HashSet  
   - Clean and efficient  

9. **Itinerary Ticket Problem**  
   - Constructing path from ticket mapping  
   - HashMap used for reverse mapping  
   - Helps in route reconstruction  

10. **Largest Subarray with Zero Sum**  
   - Using HashMap to track prefix sum indices  
   - Efficient O(n) solution  

11. **Subarray Sum Equals K**  
   - Maintaining prefix sum + count in HashMap  
   - Check `currentSum - k`  
   - Works even with negative numbers  

---

### 📌 Concepts Covered  
- HashMap internal working  
- HashSet usage  
- Map traversal and iterators  
- Frequency counting problems  
- Prefix sum + Hashing  
- Array, string & mathematical problems using hashing  
- Optimization using O(1) average-time lookups  

---

Hashing is one of the **most powerful tools** for solving real-time problems efficiently.  
This module builds strong knowledge for interviews, CP, and advanced algorithms.

---

This section builds a **strong foundation for stack-based problem solving**, preparing for advanced topics like **Expression Evaluation, Balanced Parentheses, and Monotonic Stacks**.

---

✨ **This repository is regularly updated as I continue improving in DSA using Java.**  
💡 Suggestions, contributions, and optimizations are always welcome.  

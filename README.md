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
### 📁 Files  
- **1.1_array.java**  
- **1.1_binarySearch.java**  
- **1.1_largestElement.java**  
- **1.1_linearSearch.java**  
- **1.2_pairsArray.java**  
- **1.2_reverseArray.java**  
- **1.2_subArray.java**  
- **1.3_subArraySum1.java**  
- **1.4_buyAndSellStock.java**  
- **1.4_trappRainWater.java**  
- **1.5.1_ArrayAssignment.java**  
- **1.5.2_ArrayAssignment.java**  
- **1.5.3_ArrayAssignment.java**  
- **1.5.4_ArrayAssignment.java**

---

### ⭐ Key Learning Points  

1. **Basic Array Operations (`array.java`)**  
   - Create array, take input, print array  
   - Update elements using indexing  
   - Understanding fixed-size data structure  

2. **Linear Search (`linearSearch.java`)**  
   - Scan array element-by-element  
   - Time Complexity: **O(n)**  
   - Works for unsorted arrays  

3. **Largest Element in Array (`largestElement.java`)**  
   - Track maximum value while iterating  
   - Time Complexity: **O(n)**  

4. **Binary Search (`binarySearch.java`)**  
   - Works on sorted arrays  
   - Divide array into halves each step  
   - Time Complexity: **O(log n)**  

5. **Reverse an Array (`reverseArray.java`)**  
   - Two-pointer technique  
   - Swap start ↔ end  

6. **Pairs in an Array (`pairsArray.java`)**  
   - Print all possible pairs  
   - Useful for combinational problems  
   - Time Complexity: **O(n²)**  

7. **Print All Subarrays (`subArray.java`)**  
   - Print every possible (i,j) range  
   - Time Complexity: **O(n²)**  

8. **Max Subarray Sum – Multiple Methods (`subArraySum1.java`)**  
   - **Brute Force:** O(n³)  
   - **Prefix Sum:** O(n²)  
   - **Kadane's Algorithm:** O(n) → Best & optimal  

9. **Buy & Sell Stock (`buyAndSellStock.java`)**  
   - Track minimum stock price  
   - Calculate maximum profit  
   - Time Complexity: **O(n)**  

10. **Trapping Rain Water (`trappRainWater.java`)**  
   - Compute left max & right max boundaries  
   - Using two-pointer or prefix max  
   - Time Complexity: **O(n)**  

---

### 📘 Assignments  

#### **1.5.1 Contains Duplicate (`1.5.1_ArrayAssignment.java`)**  
- Sort array → check adjacent duplicates  
- Time: **O(n log n)**  
- Space: **O(1)**  

#### **1.5.2 Search in Rotated Sorted Array (`1.5.2_ArrayAssignment.java`)**  
- Modified Binary Search  
- Time: **O(log n)**  

#### **1.5.3 Best Time to Buy & Sell Stock (`1.5.3_ArrayAssignment.java`)**  
- Track minimum & compute max profit  

#### **1.5.4 Trapping Rain Water (`1.5.4_ArrayAssignment.java`)**  
- Use prefix max OR two pointers  

---

### 📌 Concepts Covered  
- Array basics & traversal  
- Searching (Linear / Binary)  
- Reversal & pairing  
- Subarray and sum optimizations  
- Stock market profit strategy  
- Water trapping intuition  
- Efficient vs brute-force approaches  

---

This module builds a **strong foundation** in arrays — the most essential data structure for mastering DSA and cracking coding interviews.

---

## 🔹 Sorting  
### 📁 Files  
- **2.1_bubbleSort.java**  
- **2.2_selectionSort.java**  
- **2.3_insertionSort.java**  
- **2.4_countingSort.java**  
- **2.5_inbuildSorting.java**

---

### ⭐ Key Learning Points  

1. **Bubble Sort (`bubbleSort.java`)**  
   - Compares adjacent elements and swaps if needed  
   - Largest element "bubbles" to the end on each pass  
   - Time Complexity: **O(n²)**  
   - Simple but not efficient for large datasets  

2. **Selection Sort (`selectionSort.java`)**  
   - Finds the smallest element and places it at the beginning  
   - Reduces unnecessary swaps  
   - Time Complexity: **O(n²)**  
   - Useful when swap cost is high  

3. **Insertion Sort (`insertionSort.java`)**  
   - Builds a sorted portion of the array one element at a time  
   - Works well for **small** or **partially sorted** arrays  
   - Time Complexity: **O(n²)** (worst), **O(n)** (best)  

4. **Counting Sort (`countingSort.java`)**  
   - Non-comparison based sorting algorithm  
   - Works only for **integer keys** within a known range  
   - Time Complexity: **O(n + range)**  
   - Very fast when range of numbers is small  

5. **Inbuilt Sorting (`inbuildSorting.java`)**  
   - Uses **Timsort** for objects and optimized QuickSort/ MergeSort for primitives  
   - Functions:  
     - `Arrays.sort(arr)` → Ascending  
     - `Arrays.sort(arr, Collections.reverseOrder())` → Descending  
     - Range sort → `Arrays.sort(arr, start, end)`  
   - Time Complexity: **O(n log n)**  
   - Highly optimized and recommended for real-world applications  

---

### 📌 Concepts Covered  
- Comparison-based sorting  
- Stability & in-place sorting  
- Trade-offs between different sorting algorithms  
- Counting sort as a non-comparison sort  
- Using Java’s built-in sorting for optimal performance  

---

This module gives you strong fundamentals for choosing the **right sorting algorithm**, improving time complexity, and understanding internal sorting logic used in interviews and CP.

---

## 🔹 2D Array  
### 📁 Files  
- **3.1_2dArray.java**  
- **3.2_spiralMatrix.java**  
- **3.3_diagonalSum.java**  
- **3.4_sorted2DMatrix.java**

---

### ⭐ Key Learning Points  

1. **Matrix Representation (`2dArray.java`)**  
   - How to create and initialize 2D arrays  
   - Row-wise and column-wise input  
   - Accessing elements using `arr[i][j]`  
   - Understanding memory layout of 2D arrays  
   - Use cases: grids, game boards, matrices

2. **Spiral Matrix Traversal (`spiralMatrix.java`)**  
   - Traverse matrix in a spiral (layer-by-layer)  
   - Uses 4 boundaries: `top`, `bottom`, `left`, `right`  
   - Update boundaries after printing each layer  
   - Useful in matrix pattern printing and interview tasks  
   - Time Complexity: **O(n*m)**  

3. **Diagonal Sum (`diagonalSum.java`)**  
   - Sum of primary diagonal → `arr[i][i]`  
   - Sum of secondary diagonal → `arr[i][n-1-i]`  
   - Optimized to avoid double-counting the middle element  
   - Time Complexity: **O(n)**  
   - Very useful for square matrix problems  

4. **Search in Sorted 2D Matrix (`sorted2DMatrix.java`)**  
   - Matrix sorted row-wise and column-wise  
   - Efficient search using **Staircase Search**  
     - Start from **top-right** corner  
     - Move left if target < element  
     - Move down if target > element  
   - Time Complexity: **O(n + m)**  
   - Great improvement over naive O(n*m) search  

---

### 📌 Concepts Covered  
- 2D matrix creation and traversal  
- Boundary-based spiral iteration  
- Efficient diagonal computation  
- Optimized searching technique (Staircase Search)  
- Understanding matrix indexing & iteration patterns  

---

This module strengthens your ability to work with **matrix-based problems**, which are essential in DSA for grid traversal, graph adjacency matrices, simulation, and competitive programming.

---

## 🔹 String  
### 📁 Files  
- **4.1_palindrome.java**  
- **4.2_shortestPath.java**  
- **4.3_equals.java**  
- **4.3_largestString.java**  
- **4.4_stringBuilder.java**  
- **4.5_upperCase.java**  
- **4.6_compression.java**

---

### ⭐ Key Learning Points  

1. **String Basics**  
   - How to take input and store strings  
   - String length using `.length()`  
   - Concatenation using `+` or `.concat()`  
   - Strings in Java are **immutable**  

2. **Character Access & Substrings**  
   - `charAt(i)` → access individual characters  
   - `substring(start, end)` → extract part of string  
   - Used in parsing, slicing & manipulation  

3. **String Comparison (`equals.java`)**  
   - `==` compares references  
   - `.equals()` compares actual string content  
   - Essential to avoid logical bugs  

4. **Palindrome Check (`palindrome.java`)**  
   - Compare start and end characters  
   - Useful for problems like **valid palindrome**, **string reverse**, etc.  

5. **Shortest Path Problem (`shortestPath.java`)**  
   - Given directions `N, S, E, W`  
   - Compute final point using x-y plane  
   - Helps understand simulation & coordinate mapping  

6. **Largest String (`largestString.java`)**  
   - Compare strings lexicographically  
   - `"apple" < "mango"` since `'a' < 'm'`  
   - Useful for dictionary-based ordering  

7. **StringBuilder (`stringBuilder.java`)**  
   - Mutable, faster than normal String  
   - Supports:  
     - `append()`  
     - `insert()`  
     - `delete()`  
     - `reverse()`  
   - Optimized for repeated modifications  

8. **Convert to Uppercase / Title Case (`upperCase.java`)**  
   - Capitalize first letter of each word  
   - `"hi, i am sayan"` → `"Hi, I Am Sayan"`  
   - Useful formatting operation  

9. **String Compression (`compression.java`)**  
   - Compress repeated characters  
   - `"aaabbbcc"` → `"a3b3c2"`  
   - Common interview problem  

---

### 📌 Concepts Covered  
- String immutability  
- Character-level operations  
- Lexicographic comparison  
- Path simulation  
- Efficient string building  
- String compression logic  
- Basic algorithmic applications using strings  

---

This module gives you a strong understanding of **string processing**, which is heavily used in interview questions, text algorithms, parsing, and real-world applications.

---

## 🔹 Bit Manipulation  
### 📁 Files  
<!-- #### **Basic Bit Manipulation (Section 5)**
- **5.1_checkOddEven.java**  
- **5.2_powerOfTwo.java**  
- **5.3_countSetBits.java**  
- **5.4_getBit.java**  
- **5.5_setBit.java**  
- **5.6_clearBit.java**  
- **5.7_updateBit.java**  
- **5.8_clearLastIBits.java**  
- **5.9_clearRangeBits.java**  
- **5.10_fastExponentiation.java** -->

#### **Advanced Bit Manipulation (Section 17.5)**
- **5.1_evenOdd.java**  
- **5.2_getPosition.java**  
- **5.3_Questions.java**

---

### ⭐ Key Learning Points  

#### **1. Understanding Bits & Binary Logic**
- All numbers are stored in binary internally  
- Bit manipulation uses fundamental binary operations  
- Extremely fast, efficient, and useful in DSA + CP  

---

### **2. Bitwise Operators**
- **AND (`&`)** → Check a bit, filtering  
- **OR (`|`)** → Set bits  
- **XOR (`^`)** → Toggle bits, find unique element  
- **NOT (`~`)** → Flip bits  
- **Left Shift (`<<`)** → Multiply by 2  
- **Right Shift (`>>`)** → Divide by 2  

---

### **3. Basic Operations**

#### ✔ Get i-th Bit (`getBit`)  
- Mask: `1 << i`  
- Check: `(num & mask)`  

#### ✔ Set i-th Bit (`setBit`)  
- OR operation with mask  

#### ✔ Clear i-th Bit (`clearBit`)  
- Mask: `~(1 << i)`  
- Apply AND  

#### ✔ Update i-th Bit (`updateBit`)  
- Clear + Set based on bit value  

---

### **4. Range Bit Operations**
#### ✔ Clear Last i Bits (`clearLastIBits`)  
- Mask: `(~0) << i`  

#### ✔ Clear Range of Bits (`clearRangeBits`)  
- Combine left and right masks  

---

### **5. Mathematical Operations**
#### ✔ Check Even or Odd (`checkOddEven`, `evenOdd.java`)  
- `(n & 1)` → 1 = odd, 0 = even  

#### ✔ Check Power of Two (`powerOfTwo.java`)  
- `(n & (n-1)) == 0`  

#### ✔ Fast Exponentiation (`fastExponentiation.java`)  
- Compute `a^b` using binary exponentiation  
- Time Complexity: O(log n)  

#### ✔ Count Set Bits (`countSetBits.java`)  
- Count number of 1’s in binary  

---

### **6. Advanced Bit Concepts**

#### ✔ Get Position of Rightmost Set Bit (`getPosition.java`)  
- `(n & -n)` → isolate lowest set bit  
- `Integer.numberOfTrailingZeros(n)`  

#### ✔ XOR-based Tricks (`Questions.java`)  
- Find unique number in array  
- Swap numbers without temp variable  
- Find missing element  
- XOR of range  
- Toggle specific bits  

---

### 📌 Concepts Covered  
- Binary operations & masks  
- i-th bit manipulation  
- Range clearing  
- Fast power / bit-level math  
- XOR properties & tricks  
- Set bit extraction  
- Efficient O(1) bitwise solutions  

---

This complete Bit Manipulation module equips you with **powerful tools for competitive programming, optimization, and low-level logic**, forming a strong base for advanced DSA topics like DP Bitmask, Trie Bitwise, and Graph optimizations. 

---

## 🔹 OOPs (Object-Oriented Programming)  
### 📁 Files  
- **6.1_OOPS.java**  
- **6.2_GetSet.java**  
- **6.3_Constructor.java**  
- **6.4_CopyConstructor.java**  
- **6.5_inheritance-1.java**  
- **6.6_inheritance-2.java**  
- **6.7_inheritance-3.java**  
- **6.8_MethodOverloading.java**  
- **6.9_abstraction.java**  
- **6.10_interface.java**  
- **6.11_staticKey.java**  
- **6.12_superKey.java**

---

### ⭐ Key Learning Points  

1. **Basics of Object-Oriented Programming (`OOPS.java`)**  
   - Understanding classes & objects  
   - Real-world modeling using OOP concepts  
   - Importance of modularity and reusability  

2. **Encapsulation + Getters & Setters (`GetSet.java`)**  
   - Data hiding to protect variables  
   - Access private fields using getter & setter methods  
   - Avoids accidental modification of critical data  

3. **Constructors (`Constructor.java`)**  
   - Special methods to initialize objects  
   - Types of constructors:  
     - Default  
     - Parameterized  
   - Constructor Overloading  

4. **Copy Constructor (`CopyConstructor.java`)**  
   - Create a new object by copying another  
   - Helps avoid shallow copy issues  
   - Useful for cloning patterns  

5. **Inheritance (1, 2, 3)  
   (`inheritance-1.java`, `inheritance-2.java`, `inheritance-3.java`)**  
   - Reusing properties/methods from parent class  
   - Types of inheritance shown:  
     - Single  
     - Multilevel  
     - Hierarchical  
   - Promotes code reuse and extensibility  

6. **Method Overloading (`MethodOverloading.java`)**  
   - *Compile-time polymorphism*  
   - Same method name, different parameters  
   - Improves flexibility and readability  

7. **Abstraction (`abstraction.java`)**  
   - Hiding complex implementation details  
   - Focus on **what** an object does, not **how**  
   - Uses:  
     - Abstract classes  
     - Abstract methods  

8. **Interfaces (`interface.java`)**  
   - Achieve 100% abstraction  
   - Support for **multiple inheritance**  
   - Classes use `implements` to adopt interface behavior  

9. **Static Keyword (`staticKey.java`)**  
   - Shared variables across all objects  
   - Static methods don’t require an object  
   - Static blocks for initialization  
   - Useful for counters, utility functions  

10. **Super Keyword (`superKey.java`)**  
   - Call parent class constructor  
   - Access parent class variables  
   - Access overridden parent methods  
   - Used to avoid naming conflicts  

---

### 📌 Concepts Covered  
- Class & Object fundamentals  
- Data hiding & encapsulation  
- Constructors & object initialization  
- Copying objects safely  
- Reusability through inheritance  
- Polymorphism (compile-time overloading)  
- Abstraction using classes & interfaces  
- Static & super keywords  
- Clean OOP design & best practices  

---

This module builds a complete understanding of **OOP principles**, essential for writing clean, scalable, and industry-level Java applications.

---

## 🔹 Recursion  
### 📁 Files  
- **7.1_nTo1.java**  
- **7.2_1ToN.java**  
- **7.3_factorial.java**  
- **7.4_nSum.java**  
- **7.5_fibSeries.java**  
- **7.6_sorted.java**  
- **7.7_firstOcc.java**  
- **7.8_lastOcc.java**  
- **7.9_power.java**  
- **7.10_optiPower.java**  
- **7.11_tilingProb.java**  
- **7.12_removeDuplicate.java**  
- **7.13_friendPair.java**  
- **7.14_binaryString.java**

---

### ⭐ Key Learning Points  

1. **Understanding Recursion (Core Concept)**  
   - A function calling itself to solve smaller subproblems.  
   - Every recursive function includes:  
     - **Base Case** → stops recursion  
     - **Recursive Call** → moves towards solution  
   - Used when problems have natural substructure.

2. **Printing Sequences (Decreasing & Increasing)**  
   - `n → 1` (Decreasing Order)  
   - `1 → n` (Increasing Order)  
   - Helps understand recursive flow, stack usage.

3. **Factorial & Sum of First N Numbers**  
   - Classic examples of mathematical recursion  
   - Shows how large computations break into smaller ones.

4. **Fibonacci Series (`fibSeries`)**  
   - Recursively generate the n-th Fibonacci number  
   - Demonstrates exponential recursion + overlapping subproblems.

5. **Check if Array is Sorted (`sorted.java`)**  
   - Compare current element with next  
   - Recursively verify each segment  
   - Perfect for understanding index-based recursion.

6. **First & Last Occurrence (`firstOcc`, `lastOcc`)**  
   - Traverse array recursively  
   - Identify first and last index of a target value  
   - Teaches forward and backward recursion logic.

7. **Power Calculation (`power`, `optiPower`)**  
   - Simple power function → O(n) recursion  
   - Fast exponentiation (`optiPower`) → O(log n)  
   - Demonstrates divide & conquer inside recursion.

8. **Tiling Problem (`tilingProb`)**  
   - Ways to tile a 2×n board using 2×1 tiles  
   - Beautiful example similar to Fibonacci recursion.

9. **Remove Duplicates from String (`removeDuplicate`)**  
   - Track visited characters using boolean map  
   - Recursive string-building logic.

10. **Friends Pairing Problem (`friendPair`)**  
   - Recursively pair or leave friends single  
   - Classic combinatorial recursion.

11. **Binary Strings Without Consecutive 1s (`binaryString`)**  
   - Recursively choose `0` or `1`  
   - Restrict consecutive ones using previous-character tracking.

---

### 📌 Concepts Covered  
- Base case, recursive case  
- Stack memory & execution flow  
- Multiple recursive calls (tree recursion)  
- Optimized recursion (divide & conquer)  
- Combinatorial counting problems  
- Recursion with arrays, strings, and indexes  

---

This module builds a strong foundation for thinking **recursively and designing elegant solutions**, a key skill for advanced DSA topics like **Backtracking, Trees, Divide & Conquer, and Dynamic Programming**.

---

## 🔹 Divide & Conquer  
### 📁 Files  
- **8.1_mergeSort.java**  
- **8.2_quickSort.java**  
- **8.3_rotatedSortedArray.java**

---

### ⭐ Key Learning Points  

1. **Understanding Divide & Conquer Paradigm**  
   - Break the problem into smaller subproblems (Divide)  
   - Solve each subproblem recursively (Conquer)  
   - Combine solutions to solve the main problem (Merge)  
   - Used for designing highly efficient algorithms  

2. **Merge Sort (`mergeSort.java`)**  
   - Stable, comparison-based sorting algorithm  
   - Recursively splits array into halves  
   - Merges two sorted halves into one sorted list  
   - Time Complexity: **O(n log n)**  
   - Space Complexity: **O(n)**  
   - Great for linked lists and large datasets  

3. **Quick Sort (`quickSort.java`)**  
   - Select a pivot element  
   - Partition array around pivot  
   - Recursively sort left and right partitions  
   - Average Time Complexity: **O(n log n)**  
   - Worst-case Time: O(n²) (rare with random pivot)  
   - Space Complexity: **O(log n)**  
   - Faster than Merge Sort in practice due to in-place partitioning  

4. **Search in Rotated Sorted Array (`rotatedSortedArray.java`)**  
   - Modified binary search  
   - Handle rotation pivot by checking sorted half  
   - Time Complexity: **O(log n)**  
   - Shows the power of divide & conquer beyond sorting  

---

### 📌 Concepts Covered  
- Recursion + splitting problems  
- Efficient sorting with Merge Sort and Quick Sort  
- Partitioning logic  
- Modified binary search on rotated arrays  
- Time and space trade-offs  
- Real-world applications of divide & conquer strategy  

---

This module strengthens your ability to design **efficient recursive algorithms**, a must-know skill for competitive programming and coding interviews. 

---

## 🔹 Backtracking  
### 📁 Files  
- **9.1_basic.java**  
- **9.2_findSubset.java**  
- **9.3_findPermutation.java**  
- **9.4_nQueen.java**  
- **9.5_gridWays.java**  
- **9.6_gridTCn.java**  
- **9.7_suduku.java**

---

### ⭐ Key Learning Points  

1. **Understanding Backtracking (Core Concept)**  
   - A technique to build solutions step-by-step and *undo (backtrack)* when a path becomes invalid.  
   - Used for exploring all possibilities efficiently.  
   - Works like: **Choose → Explore → Unchoose**.

2. **Basic Backtracking Template (`basic.java`)**  
   - Introduces recursion + decision making.  
   - Shows how to backtrack by removing last choice.

3. **Generating Subsets (`findSubset`)**  
   - For each element → choose it OR skip it.  
   - Demonstrates binary decision tree exploration.  
   - Useful for power set, bitmask-style problems.

4. **Generating Permutations (`findPermutation`)**  
   - Rearrange characters/numbers in all possible orders.  
   - Uses recursion + swapping or visited array.  
   - Important for permutation-based questions.  

5. **N-Queen Problem (`nQueen`)**  
   - Place N queens on an NxN board without attacking each other.  
   - Demonstrates constraint checking (rows, columns, diagonals).  
   - Classic problem to understand pruning (cutting invalid branches).  

6. **Grid Ways (`gridWays`)**  
   - Count number of ways to reach bottom-right from top-left.  
   - Only moves allowed: down or right.  
   - Recursive + combinatorial intuition.

7. **Grid Traversal With Constraints (`gridTCn`)**  
   - Similar to grid ways but includes obstacles or blocked cells.  
   - Teaches how to apply backtracking with conditions.  

8. **Sudoku Solver (`suduku`)**  
   - 9×9 Sudoku puzzle solver using backtracking.  
   - Checks valid placement for row, column, and 3×3 subgrid.  
   - Strong example of constraint satisfaction problems.

---

### 📌 Concepts Covered  
- Recursion + decision trees  
- Trying valid choices and undoing invalid ones  
- Constraint checking (valid position, duplicates, collisions)  
- Optimization via pruning  
- Applications: subsets, permutations, N-Queens, Sudoku, grid paths  

---

This section builds powerful intuition for solving **complex search problems**, making you interview-ready for pattern-based questions frequently asked in FAANG-level rounds.

--- 

## 🔹 ArrayList  
### 📁 Files  
- **10.1_ArrayList.java**  
- **10.2_ALReverce.java**  
- **10.3_MaxAL.java**  
- **10.4_ALSwap.java**  
- **10.5_ALsort.java**  
- **10.6_multiDiamentionalAL.java**  
- **10.7_Container_With_Rain_Water.java**  
- **10.8_pairSum1.java**  
- **10.9_pairSum2.java**

---

### ⭐ Key Learning Points  

1. **Understanding ArrayList Basics (`ArrayList.java`)**  
   - A dynamic, resizable array in Java  
   - Useful methods:  
     - `add()` – insert elements  
     - `get()` – access elements  
     - `set()` – update elements  
     - `remove()` – delete elements  
     - `size()` – current length  
   - Supports random access → **O(1)**  
   - Automatically grows when needed  

2. **Reversing an ArrayList (`ALReverce.java`)**  
   - Two-pointer technique  
   - Swap from both ends until middle  
   - Helps understand index manipulation and in-place operations  

3. **Finding Maximum Element (`MaxAL.java`)**  
   - Loop through list and track max value  
   - Reinforces iteration logic with ArrayList  

4. **Swapping Two Elements (`ALSwap.java`)**  
   - Swap using a temporary variable  
   - Or use `Collections.swap(list, i, j)`  
   - Important for reversing, sorting, or permutation generation  

5. **Sorting an ArrayList (`ALsort.java`)**  
   - `Collections.sort(list)` → Ascending  
   - `Collections.sort(list, Collections.reverseOrder())` → Descending  
   - Internally uses **Timsort** (O(n log n))  
   - Recommended over manual sorting for reliability & speed  

6. **Multidimensional ArrayList (`multiDiamentionalAL.java`)**  
   - ArrayList of ArrayList  
   - Perfect for grids, matrices, dynamic tables  
   - Operations:  
     - `add(new ArrayList<>())`  
     - Nested loops for traversal  

7. **Container With Most Rain Water (`Container_With_Rain_Water.java`)**  
   - Classic two-pointer problem  
   - Find max water trapped between two heights  
   - Moves pointers based on smaller height  
   - Time Complexity: **O(n)**  

8. **Pair Sum — Sorted Array (`pairSum1.java`)**  
   - Uses **2-pointer technique**  
   - Works only when ArrayList is **sorted**  
   - Efficient: **O(n)**  
   - Find pair whose sum equals target  

9. **Pair Sum — Sorted and Rotated Array (`pairSum2.java`)**  
   - First find pivot (breaking point)  
   - Use modified two-pointer approach in circular manner  
   - Time Complexity: **O(n)**  
   - Common interview problem  

---

### 📌 Concepts Covered  
- Dynamic lists and memory resizing  
- Index-based manipulation  
- Sorting, swapping, max operations  
- Multidimensional data structures  
- Two-pointer techniques  
- Rain water (container problem)  
- Pair sum (sorted & rotated arrays)  

---

This module builds a strong foundation in **ArrayList operations**, preparing you for real-world Java development and advanced DSA patterns involving dynamic arrays.

---

## 🔹 Linked List  
### 📁 Files  
- **11.1_LinkedList.java**

---

### ⭐ Key Learning Points  

1. **Node Class & Structure**  
   - Custom `Node` class storing:  
     - `int data`  
     - `Node next`  
   - Represents each element of the linked list  
   - Allows dynamic memory (unlike arrays)

2. **Head, Tail & Size Management**  
   - `head` → start of list  
   - `tail` → end of list  
   - `size` → total number of nodes  
   - Efficient updates in O(1) for addFirst/addLast

---

### **3. Insertion Operations**

#### ✔ `addFirst(data)`  
- Creates a new node and inserts at the beginning  
- When list is empty → head = tail = newNode  
- Time Complexity: **O(1)**  

#### ✔ `addLast(data)`  
- Appends node at the end  
- Uses `tail` for O(1) insertion  

#### ✔ `add(idx, data)`  
- Insert node at any index  
- Traverse until `idx-1` then insert  
- Time Complexity: **O(n)**  

---

### **4. Deletion Operations**

#### ✔ `removeFirst()`  
- Removes first node  
- Handles empty and single-node list  
- Time Complexity: **O(1)**  

#### ✔ `removeLast()`  
- Traverse to second-last node  
- Set it as new tail  
- Time Complexity: **O(n)**  

---

### **5. Searching Elements**

#### ✔ Iterative Search — `itrSearch(key)`  
- Traverse list linearly  
- Returns index if found  
- Time Complexity: **O(n)**  

#### ✔ Recursive Search — `recSearch(key)`  
- Uses helper function  
- Searches by recursion  
- Time Complexity: **O(n)**  

---

### **6. Reverse Linked List (`reverse()`)**  
- Uses **previous, current, next** pointers  
- Reverses entire list in O(n)  
- Updates both head & tail  

---

### **7. Delete N-th Node from End (`deleteNthfromEnd(n)`)**  
- Step 1: Count total size  
- Step 2: Calculate (size - n)th node  
- Step 3: Remove target node  
- Time Complexity: **O(n)**  

---

### **8. Find Middle Node (`findMid()`)**  
- Uses **slow & fast pointer** approach  
- Slow → +1, Fast → +2  
- When fast reaches end → slow is middle  
- Time Complexity: **O(n)**  

---

### **9. Check if Linked List is Palindrome (`checkPelendrom()`)**  
Steps:  
1. Find mid  
2. Reverse second half  
3. Compare left & right halves  
4. Restore optional  
- Time Complexity: **O(n)**  
- Space: **O(1)**  

---

### **10. Detect Cycle in Linked List (`isCycle()`)**  
- Uses **Floyd’s Cycle Detection Algorithm**  
- Slow & fast pointer  
- If both meet → cycle exists  
- Time Complexity: **O(n)**  

---

### **11. Printing the Linked List (`print()`)**  
- Traverses from head to tail  
- Prints: `data -> ... -> Null`  
- Handles empty list  

---

### 📌 Concepts Covered  
- LinkedList node representation  
- Head, tail, and size tracking  
- Insertions & deletions (O(1)/O(n))  
- Searching (iterative + recursive)  
- Reversing and mid-finding  
- Palindrome check  
- Cycle detection (Floyd’s Algo)  
- Index-based operations  
- Dynamic memory & pointer manipulation  

---

This module gives you a complete understanding of **Singly Linked Lists**, preparing you for more advanced topics like **LinkedList cycle removal, merge operations, doubly linked lists, and linked list-based problems asked in interviews.**

---

## 🔹 Double Linked List  
### Files  
- **12.1 cycle.java**
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

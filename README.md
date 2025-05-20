# DSA in JAVA

## Topics
### 1. Array
|  |
| ------- |
| **Operation (Create,Input,Output,Update)** |
| **Linear Search** |
| **Largest Number** |
| **Binary Search** |
| **Reverce An Array** |
| **Pairs in An Array** |
| **Print SubArray** |
| **MaxSum SubArray(Brute Force),(Prefix Sum),(Kadane's Algorithm)** |
| **Rain trapped water** |
| **Buy And Sell Stock** |
|  |
 ### ARRAY - Assignment 

**1.5.1_Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.** 
**<p>Simple to understand - just sort and check neighbors Uses O(1) extra space Has O(n log n) time complexity due to sorting</p>**
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1, 2, 3, 1]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1, 2, 3, 4]
<strong>Output:</strong> false
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] 
<strong>Output:</strong> true
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
    <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>

**1.5.2_There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).**
**For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].**
**Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.**
**<p>Time Complexity: O(log n) Space Complexity: O(1)runtime complexity.</p>**
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [4, 5, 6, 7, 0, 1, 2],target=0
<strong>Output:</strong> 4
</pre>
<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [4, 5, 6, 7, 0, 1, 2],target=3
<strong>Output:</strong> -1
</pre>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1],target=3
<strong>Output:</strong> -1
</pre>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5000</code></li>
    <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
    <li>All values of nums are unique.</li>
    <li>nums is an ascending array that is possibly rotated.</li>
        <li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>

</ul>

<p>&nbsp;</p>

**1.5.3_You are given an array prices where prices[i] is the price of a given stock on the ith day.** 
**<p>Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.</p>**

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> Prices = [7,1,5,3,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. <br>Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell. 
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong></strong> In this case, no transactions are done and the max profit = 0. 
</pre>


<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
    <li><code>0<sup></sup> &lt;= Prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>

**1.5.4_Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.** 


<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> height = [0,1,0,2,1,0,1,3,2,1,2,1]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].<br>In this case, 6 units of rain water (blue section) are being trapped. 
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> height = [4,2,0,3,2,5]
<strong>Output:</strong> 9
</pre>


<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == height.length </code></li>
    <li><code>1<sup></sup> &lt;= n &lt;= 2 * 10<sup>4</sup></code></li>
    <li><code>0<sup></sup> &lt;= n &lt;= height[i] &lt;= 10<sup>4</sup></code></li>

</ul>

<p>&nbsp;</p>


### 2. Sorting
|  |
| ------- |
| **Basic Algoritham** |
| |
| **Bubble Sort** |
| **Selection Sort** |
| **Insertion Sort** |
| **Counting Sort** |

|   |
| ------------ |
| **Inbuild Sorting** |
| *Accending Order* :- **Arrays.sort(arr);** **Arrays.sort(arr,0,3);**|
| *Decending Order* :- **Arrays.sort(arr,Collections.reverseOrder());** **Arrays.sort(arr,0,3,Collections.reverseOrder());**|
|*TC* :- $O(n \log n)$|
||
### 3. 2D Array
|   |
|   ------------------  |
| **2D Array** |
| *Example* |
| *Representation* |
| **Spiral Matrix** |
| **Diagonal Sum** |
| **Search in Sorted Matrix** <br> *Staircase Search*|
||
### 4. String
|   |
|   ------------------  |
| **String** |
| *Input* |
| *Length* |
| *Concatination* |
| *charAt Method*<br>*str.subString(strIndx,endIndx)*<br>*str.equal(str1)* |
| **Q1**  *Palindrom Word or not* |
| **Q2**  *Shortest Path(E,W,N,S)* |
| **Q3**  *Largest String{"apple","mango","banana"}* <br> *O/P:- mango*|
| **String Builder:-**<br> *StringBuilder str = new StringBuilder("");* <br>*str.append(ch);*<br>**Example:-**<br> *Q4. "hi, i am sayan" => "Hi, I Am Sayan"* <br> *Q5. "aaabbbcc"=>""a3b3c2"*|
||
### 5. Bit Manipulation
|   |
| ----------------------------- |       
| **Binary Number**             |       |
| **Bitwise AND (&)**           |       |
| **Bitwise OR ( \| )**           |       |
| **Bitwise XOR (^)**           |       |
| **Bitwise NOT (~)**          |       |
| **Left Shift (<<)**           |       |
| **Right Shift (>>)**          |       |
| **Getting i'th Bit**             |       |
| **Setting a Bit**             |       |
| **Clearing a Bit**            |       |
| **Checking a Bit**            |       |
| **Counting Set Bits**         |       |
| **Binary Masks**              |       |
| **Fast Exponentation**              |       |
| **Example :-**  <br> *5.1 Check odd or even* <br> *5.2 Check if a number is a power of **2** or not* <br> *5.3 Counting SetBits in a number* ||


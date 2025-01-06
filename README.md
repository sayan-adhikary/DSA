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

**5.1_Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.** 
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

**5.2_There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).**
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
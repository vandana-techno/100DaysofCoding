Question link - https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

Question - Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
 

Testcase 1:

Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8

Output: 13

Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13



Testcase 2:

Input: matrix = [[-5]], k = 1

Output: -5

 

Constraints:

1. n == matrix.length == matrix[i].length

2. 1 <= n <= 300

3. -10^9 <= matrix[i][j] <= 10^9

4. All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.

5. 1 <= k <= n^2


Language used- Java

Platform- Leetcode
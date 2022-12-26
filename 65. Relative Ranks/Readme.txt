Question link - https://leetcode.com/problems/relative-ranks/description/

Question - You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.



The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on.

 

Testcase 1:

Input: score = [5,4,3,2,1]

Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]

Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].



Testcase 2:

Input: score = [10,3,8,9,4]

Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]

Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].



 

Constraints:

1. n == score.length

2. 1 <= n <= 10^4

3. 0 <= score[i] <= 10^6

4. All the values in score are unique.




Language used- Java

Platform- Leetcode
package problem;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
//    Given an integer array nums, return the length of the longest strictly increasing subsequence.
//    A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
//
//    Example 1:
//    Input: nums = [10,9,2,5,3,7,101,18]
//    Output: 4
//    Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
//
//    Example 2:
//    Input: nums = [0,1,0,3,2,3]
//    Output: 4
//
//    Example 3:
//    Input: nums = [7,7,7,7,7,7,7]
//    Output: 1
//
//
//    Constraints:
//    1 <= nums.length <= 2500
//    -104 <= nums[i] <= 104
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int ans = 0;
        for (int num : nums) {
            int left = Arrays.binarySearch(dp, 0, ans, num);
            if(left < 0){
                left = -left -1;
            }

            if(left == ans){
                ans ++;
            }

            dp[left] = num;
        }

        return ans;
    }
}

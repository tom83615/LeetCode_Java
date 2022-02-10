package problem;

//        Given an array nums of positive integers, return the longest possible length of an array prefix of nums, such that it is possible to remove exactly one element from this prefix so that every number that has appeared in it will have the same number of occurrences.
//
//        If after removing one element there are no remaining elements, it's still considered that every appeared number has the same number of ocurrences (0).
//
//        Example 1:
//
//        Input: nums = [2,2,1,1,5,3,3,5]
//        Output: 7
//        Explanation: For the subarray [2,2,1,1,5,3,3] of length 7, if we remove nums[4] = 5, we will get [2,2,1,1,3,3], so that each number will appear exactly twice.
//
//        Example 2:
//
//        Input: nums = [1,1,1,2,2,2,3,3,3,4,4,4,5]
//        Output: 13
//
//
//        Constraints:
//
//        2 <= nums.length <= 105
//        1 <= nums[i] <= 105


import java.util.HashMap;
import java.util.Map;

public class MaximumEqualFrequency {
    public static int maxEqualFreq(int[] nums) {
        int n = nums.length, res = 0;
        Map<Integer, Integer> numbers = new HashMap<>();
        Map<Integer, Integer> frequencys = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int cntN = numbers.getOrDefault(num, 0);
            numbers.put(num, cntN + 1);
            int cntF = frequencys.getOrDefault(cntN, 0);

            if (cntF * cntN == i){   // 1, 1, 1, 2
                res = i + 1;
            }

            frequencys.put(cntN++, cntF - 1);
            cntF = frequencys.getOrDefault(cntN, 0) + 1;
            frequencys.put(cntN, cntF);

            if (cntF * cntN == i + 1 && i + 1 < n){  // 2, 2, 2,  + 1, not the last one
                res = i + 2;
            }else if(cntF * cntN + cntN + 1 == i + 1 && frequencys.getOrDefault(cntN + 1, 0) == 1){ // 2, 3, 2, 2
                res = i + 1;
            }else if (cntF * cntN == i){ //2, 1, 2, 2
                res = i + 1;
            }
        }
        return res;
    }
}

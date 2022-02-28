package problem;

//        You are given a sorted unique integer array nums.
//
//        Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//
//        Each range [a,b] in the list should be output as:
//
//        "a->b" if a != b
//        "a" if a == b
//
//        Example 1:
//
//        Input: nums = [0,1,2,4,5,7]
//        Output: ["0->2","4->5","7"]
//        Explanation: The ranges are:
//        [0,2] --> "0->2"
//        [4,5] --> "4->5"
//        [7,7] --> "7"
//
//        Example 2:
//
//        Input: nums = [0,2,3,4,6,8,9]
//        Output: ["0","2->4","6","8->9"]
//        Explanation: The ranges are:
//        [0,0] --> "0"
//        [2,4] --> "2->4"
//        [6,6] --> "6"
//        [8,9] --> "8->9"
//
//
//        Constraints:
//        0 <= nums.length <= 20
//        -231 <= nums[i] <= 231 - 1
//        All the values of nums are unique.
//        nums is sorted in ascending order.

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0){ return result;}
        if(nums.length == 1){
            addList(result, nums[0], nums[0]);
            return result;
        }

        int start = nums[0];
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] != nums[i-1]+1){
                addList(result, start, nums[i-1]);
                start = nums[i];

            }
        }

        if(nums[nums.length-1] != nums[nums.length-2]+1){
            addList(result, start, nums[nums.length-2]);
            addList(result, nums[nums.length-1], nums[nums.length-1]);
        }else{
            addList(result, start, nums[nums.length-1]);
        }

        return result;
    }

    public static void addList(List<String> list, int start, int end){
        if(start == end){
            list.add(String.valueOf(start));
        }else{
            list.add(start+"->"+end);
        }
    }
}

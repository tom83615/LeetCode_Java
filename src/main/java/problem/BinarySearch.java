package problem;

public class BinarySearch {
//    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//    You must write an algorithm with O(log n) runtime complexity.
//
//
//
//    Example 1:
//
//    Input: nums = [-1,0,3,5,9,12], target = 9
//    Output: 4
//    Explanation: 9 exists in nums and its index is 4
//    Example 2:
//
//    Input: nums = [-1,0,3,5,9,12], target = 2
//    Output: -1
//    Explanation: 2 does not exist in nums so return -1
//
//
//    Constraints:
//
//            1 <= nums.length <= 104
//            -104 < nums[i], target < 104
//    All the integers in nums are unique.
//    nums is sorted in ascending order.
    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length);
    }

    public static int search(int[] nums, int target, int start, int end) {
        int mid = (start+end)/2;
        if(target == nums[mid]){
            return mid;
        }else{
            if(end-start < 2){
                return -1;
            }else{
                if(target > nums[mid]){
                    return search(nums, target, mid, end);
                }else{
                    return search(nums, target, start, mid);
                }
            }
        }
    }
}

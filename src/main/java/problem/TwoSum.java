package problem;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = target - nums[i];
            if(indexMap.containsKey(requiredNum)){
                return new int[]{indexMap.get(requiredNum), i};
            }else{
                indexMap.put(nums[i], i);
            }

        }

        return new int[2];
    }
}

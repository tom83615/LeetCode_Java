package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTester{

    @Test
    public void example1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = {0,1};

        int[] re = TwoSum.twoSum(nums, target);

        Assertions.assertArrayEquals(re, result);
    }

    @Test
    public void example2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = {1,2};

        int[] re = TwoSum.twoSum(nums, target);

        Assertions.assertArrayEquals(re, result);
    }

    @Test
    public void example3(){
        int[] nums = {3,3};
        int target = 6;
        int[] result = {0,1};

        int[] re = TwoSum.twoSum(nums, target);

        Assertions.assertArrayEquals(re, result);
    }
}

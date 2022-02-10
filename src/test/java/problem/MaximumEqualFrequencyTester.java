package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumEqualFrequencyTester {

    @Test
    public void example1(){
        int[] nums = {2,2,1,1,5,3,3,5};
        int result = 7;

        int re = MaximumEqualFrequency.maxEqualFreq(nums);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example2(){
        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5};
        int result = 13;

        int re = MaximumEqualFrequency.maxEqualFreq(nums);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example3(){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int result = 9;

        int re = MaximumEqualFrequency.maxEqualFreq(nums);

        Assertions.assertEquals(result, re);
    }
}

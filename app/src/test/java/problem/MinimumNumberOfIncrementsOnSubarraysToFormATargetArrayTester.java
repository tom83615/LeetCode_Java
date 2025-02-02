package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfIncrementsOnSubarraysToFormATargetArrayTester {

    @Test
    public void example1(){
        int[] target  = {1,2,3,2,1};
        int result = 3;

        int re = MinimumNumberOfIncrementsOnSubarraysToFormATargetArray.minNumberOperations(target);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example2(){
        int[] target = {3,1,1,2};
        int result = 4;

        int re = MinimumNumberOfIncrementsOnSubarraysToFormATargetArray.minNumberOperations(target);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example3(){
        int[] target = {3,1,5,4,2};
        int result = 7;

        int re = MinimumNumberOfIncrementsOnSubarraysToFormATargetArray.minNumberOperations(target);

        Assertions.assertEquals(result, re);
    }
}

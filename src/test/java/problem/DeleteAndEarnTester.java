package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteAndEarnTester {

    @Test
    public void example1(){
        int[] nums = {3,4,2};
        int result = 6;

        int actual = DeleteAndEarn.deleteAndEarn(nums);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[] nums = {2,2,3,3,3,4};
        int result = 9;

        int actual = DeleteAndEarn.deleteAndEarn(nums);
        Assertions.assertEquals(result, actual);
    }
}

package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsTester {

    MaxNumberOfKSumPairs maxNumberOfKSumPairs = new MaxNumberOfKSumPairs();

    @Test
    public void example1(){
        int[] nums = {1,2,3,4};
        int k = 5;
        int except = 2;

        int actual = maxNumberOfKSumPairs.maxOperations(nums, k);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int except = 1;

        int actual = maxNumberOfKSumPairs.maxOperations(nums, k);

        assertEquals(except, actual);

    }
}

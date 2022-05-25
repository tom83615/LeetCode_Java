package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTester {
    LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    public void example1(){
        int[] nums = {10,9,2,5,3,7,101,18};
        int except = 4;

        int actual = longestIncreasingSubsequence.lengthOfLIS(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] nums = {0,1,0,3,2,3};
        int except = 4;

        int actual = longestIncreasingSubsequence.lengthOfLIS(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[] nums = {7,7,7,7,7,7,7};
        int except = 1;

        int actual = longestIncreasingSubsequence.lengthOfLIS(nums);

        assertEquals(except, actual);
    }
}

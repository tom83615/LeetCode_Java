package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestUnsortedContinuousSubarrayTester {
    ShortestUnsortedContinuousSubarray shortestUnsortedContinuousSubarray = new ShortestUnsortedContinuousSubarray();

    @Test
    public void example1(){
        int[] nums = {2,6,4,8,10,9,15};
        int except = 5;

        int actual = shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] nums = {1,2,3,4};
        int except = 0;

        int actual = shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[] nums = {1};
        int except = 0;

        int actual = shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example4(){
        int[] nums = {2,1};
        int except = 2;

        int actual = shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example5(){
        int[] nums = {1,3,2,2,2};
        int except = 4;

        int actual = shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums);

        assertEquals(except, actual);
    }
}

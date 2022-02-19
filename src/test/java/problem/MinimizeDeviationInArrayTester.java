package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimizeDeviationInArrayTester {

    @Test
    public void example1(){
        int[] nums  = {1,2,3,4};
        int Actual = 1;
        int result = MinimizeDeviationInArray.minimumDeviation(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        int[] nums  = {4,1,5,20,3};
        int Actual = 3;
        int result = MinimizeDeviationInArray.minimumDeviation(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        int[] nums  = {2,10,8};
        int Actual = 3;
        int result = MinimizeDeviationInArray.minimumDeviation(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example4(){
        int[] nums  = {0,0};
        int Actual = 0;
        int result = MinimizeDeviationInArray.minimumDeviation(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example4(){
        int[] nums  = {3,5};
        int Actual = 1;
        int result = MinimizeDeviationInArray.minimumDeviation(nums);

        Assertions.assertEquals(Actual, result);
    }
}

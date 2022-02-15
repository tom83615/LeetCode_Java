package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HouseRobberIITester {

    @Test
    public void example1(){
        int[] nums  = {2,3,2};
        int Actual = 3;
        int result = HouseRobberII.rob(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        int[] nums  = {1,2,3,1};
        int Actual = 4;
        int result = HouseRobberII.rob(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        int[] nums  = {1,2,3};
        int Actual = 3;
        int result = HouseRobberII.rob(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example4(){
        int[] nums  = {1};
        int Actual = 1;
        int result = HouseRobberII.rob(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example5(){
        int[] nums  = {1,2};
        int Actual = 2;
        int result = HouseRobberII.rob(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example6(){
        int[] nums  = {1,2,1,0,0,0,2,0,2};
        int Actual = 6;
        int result = HouseRobberII.rob(nums);

        Assertions.assertEquals(Actual, result);
    }
}

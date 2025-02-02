package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTester {
    MissingNumber missingNumber = new MissingNumber();

    @Test
    public void example1(){
        int[] nums = {3,0,1};
        int except = 2;

        int actual = missingNumber.missingNumber(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] nums = {0,1};
        int except = 2;

        int actual = missingNumber.missingNumber(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int except = 8;

        int actual = missingNumber.missingNumber(nums);

        assertEquals(except, actual);
    }
}

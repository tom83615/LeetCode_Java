package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayByParityTester {
    SortArrayByParity sortArrayByParity = new SortArrayByParity();

    @Test
    public void example1(){
        int[] nums = {3,1,2,4};
        int[] except = {2,4,3,1};

        int[] actual = sortArrayByParity.sortArrayByParity(nums);

        assertArrayEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] nums = {0};
        int[] except = {0};

        int[] actual = sortArrayByParity.sortArrayByParity(nums);

        assertArrayEquals(except, actual);
    }

    @Test
    public void example3(){
        int[] nums = {2,4,1,3};
        int[] except = {2,4,1,3};

        int[] actual = sortArrayByParity.sortArrayByParity(nums);

        assertArrayEquals(except, actual);
    }
}

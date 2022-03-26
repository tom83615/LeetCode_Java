package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTester {
    @Test
    public void example1(){
        int[] nums  = {-1,0,3,5,9,12};
        int target = 9;
        int result = 4;
        int actual = BinarySearch.search(nums, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[] nums  = {-1,0,3,5,9,12};
        int target = 2;
        int result = -1;
        int actual = BinarySearch.search(nums, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int[] nums  = {0,1,2};
        int target = -1;
        int result = -1;
        int actual = BinarySearch.search(nums, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        int[] nums  = {0,1,2};
        int target = 0;
        int result = 0;
        int actual = BinarySearch.search(nums, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        int[] nums  = {0,1,2};
        int target = 2;
        int result = 2;
        int actual = BinarySearch.search(nums, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example6(){
        int[] nums  = {0};
        int target = -1;
        int result = -1;
        int actual = BinarySearch.search(nums, target);
        Assertions.assertEquals(result, actual);
    }
}

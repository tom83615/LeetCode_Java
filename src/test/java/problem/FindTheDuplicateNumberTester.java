package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDuplicateNumberTester {

    @Test
    public void example1(){
        int[] costs = {1,3,4,2,2};
        int result = 2;
        int actual = FindTheDuplicateNumber.findDuplicate(costs);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[] costs = {3,1,3,4,2};
        int result = 3;
        int actual = FindTheDuplicateNumber.findDuplicate(costs);
        Assertions.assertEquals(result, actual);
    }
}

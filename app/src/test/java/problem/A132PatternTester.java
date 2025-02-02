package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class A132PatternTester {
    A132Pattern a132Pattern = new A132Pattern();

    @Test
    public void example1(){
        int[]  nums = {1,2,3,4};

        boolean actual = a132Pattern.find132pattern(nums);

        assertFalse(actual);
    }

    @Test
    public void example2(){
        int[]  nums = {3,1,4,2};

        boolean actual = a132Pattern.find132pattern(nums);

        assertTrue(actual);
    }

    @Test
    public void example3(){
        int[]  nums = {-1,3,2,0};

        boolean actual = a132Pattern.find132pattern(nums);

        assertTrue(actual);
    }
}

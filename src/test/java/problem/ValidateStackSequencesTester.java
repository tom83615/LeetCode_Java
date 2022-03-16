package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateStackSequencesTester {

    @Test
    public void example1(){
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        boolean result = true;

        boolean actual = ValidateStackSequences.validateStackSequences(pushed, popped);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        boolean result = false;

        boolean actual = ValidateStackSequences.validateStackSequences(pushed, popped);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int[] pushed = {1,2,3};
        int[] popped = {1,2,3};
        boolean result = true;

        boolean actual = ValidateStackSequences.validateStackSequences(pushed, popped);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        int[] pushed = {};
        int[] popped = {};
        boolean result = true;

        boolean actual = ValidateStackSequences.validateStackSequences(pushed, popped);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        int[] pushed = {1};
        int[] popped = {1};
        boolean result = true;

        boolean actual = ValidateStackSequences.validateStackSequences(pushed, popped);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example6(){
        int[] pushed = {1,2,3};
        int[] popped = {3,1,2};
        boolean result = false;

        boolean actual = ValidateStackSequences.validateStackSequences(pushed, popped);

        Assertions.assertEquals(result, actual);
    }
}

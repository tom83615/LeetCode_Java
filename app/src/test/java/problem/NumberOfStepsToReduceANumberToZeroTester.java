package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfStepsToReduceANumberToZeroTester {
    NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();

    @Test
    public void example1(){
        int num = 14;
        int except = 6;

        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int num = 8;
        int except = 4;

        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int num = 123;
        int except = 12;

        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);

        assertEquals(except, actual);
    }

    @Test
    public void example4(){
        int num = 1;
        int except = 1;

        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);

        assertEquals(except, actual);
    }

    @Test
    public void example5(){
        int num = 0;
        int except = 0;

        int actual = numberOfStepsToReduceANumberToZero.numberOfSteps(num);

        assertEquals(except, actual);
    }
}

package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTester {
    DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    public void example1(){
        int dividend = 10, divisor = 3;
        int except = 3;

        int actual = divideTwoIntegers.divide(dividend, divisor);
        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int dividend = 7, divisor = -3;
        int except = -2;

        int actual = divideTwoIntegers.divide(dividend, divisor);
        assertEquals(except, actual);
    }
}

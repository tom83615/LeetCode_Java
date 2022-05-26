package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTester {
    NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @Test
    public void example1(){
        int n = 0b00000000000000000000000000001011;
        int except = 3;

        int actual = numberOf1Bits.hammingWeight(n);

        assertEquals(actual, except);
    }

    @Test
    public void example2(){
        int n = 0b00000000000000000000000010000000;
        int except = 1;

        int actual = numberOf1Bits.hammingWeight(n);

        assertEquals(actual, except);
    }

    @Test
    public void example3(){
        int n = 0b11111111111111111111111111111101;
        int except = 31;

        int actual = numberOf1Bits.hammingWeight(n);

        assertEquals(actual, except);
    }
}

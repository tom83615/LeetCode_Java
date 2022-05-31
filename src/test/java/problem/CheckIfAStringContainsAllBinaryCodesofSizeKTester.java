package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIfAStringContainsAllBinaryCodesofSizeKTester {
    CheckIfAStringContainsAllBinaryCodesofSizeK checkIfAStringContainsAllBinaryCodesofSizeK =
            new CheckIfAStringContainsAllBinaryCodesofSizeK();

    @Test
    public void example1(){
        String s = "00110110";
        int k = 2;

        boolean actual = checkIfAStringContainsAllBinaryCodesofSizeK.hasAllCodes(s, k);

        assertTrue(actual);
    }

    @Test
    public void example2(){
        String s = "0110";
        int k = 1;

        boolean actual = checkIfAStringContainsAllBinaryCodesofSizeK.hasAllCodes(s, k);

        assertTrue(actual);
    }

    @Test
    public void example3(){
        String s = "0110";
        int k = 2;

        boolean actual = checkIfAStringContainsAllBinaryCodesofSizeK.hasAllCodes(s, k);

        assertFalse(actual);
    }
}

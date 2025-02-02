package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnesAndZeroesTester {
    OnesAndZeroes onesAndZeroes = new OnesAndZeroes();

    @Test
    public void example1(){
        String[] strs = {"10","0001","111001","1","0"};
        int m = 5, n = 3;

        int except = 4;

        int actual = onesAndZeroes.findMaxForm(strs, m, n);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        String[] strs = {"10","0","1"};
        int m = 1, n = 1;

        int except = 2;

        int actual = onesAndZeroes.findMaxForm(strs, m, n);

        assertEquals(except, actual);
    }
}

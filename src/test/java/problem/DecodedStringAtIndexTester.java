package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecodedStringAtIndexTester {

    @Test
    public void example1(){
        String s = "leet2code3";
        int k = 10;
        String result = "o";
        String re = DecodedStringAtIndex.decodeAtIndex(s, k);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example2(){
        String s = "ha22";
        int k = 5;
        String result = "h";
        String re = DecodedStringAtIndex.decodeAtIndex(s, k);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example3(){
        String s = "a2345678999999999999999";
        int k = 1;
        String result = "a";
        String re = DecodedStringAtIndex.decodeAtIndex(s, k);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example4(){
        String s = "a23";
        int k = 6;
        String result = "a";
        String re = DecodedStringAtIndex.decodeAtIndex(s, k);

        Assertions.assertEquals(result, re);
    }

    @Test
    public void example5(){
        String s = "a2b3c4d5e6f7g8h9";
        int k = 10;
        String result = "c";
        String re = DecodedStringAtIndex.decodeAtIndex(s, k);

        Assertions.assertEquals(result, re);
    }
}

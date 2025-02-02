package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringIITester {

    RemoveAllAdjacentDuplicatesInStringII removeAllAdjacentDuplicatesInStringII = new RemoveAllAdjacentDuplicatesInStringII();

    @Test
    public void example1(){
        String s = "abcd";
        int k = 2;

        String except = "abcd";

        String actual = removeAllAdjacentDuplicatesInStringII.removeDuplicates(s, k);

        assertEquals(actual, except);
    }

    @Test
    public void example2(){
        String s = "deeedbbcccbdaa";
        int k = 3;

        String except = "aa";

        String actual = removeAllAdjacentDuplicatesInStringII.removeDuplicates(s, k);

        assertEquals(actual, except);
    }

    @Test
    public void example3(){
        String s = "pbbcggttciiippooaais";
        int k = 2;

        String except = "ps";

        String actual = removeAllAdjacentDuplicatesInStringII.removeDuplicates(s, k);

        assertEquals(actual, except);
    }
}

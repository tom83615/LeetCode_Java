package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSortedVowelStringsTester {
    CountSortedVowelStrings countSortedVowelStrings = new CountSortedVowelStrings();

    @Test
    public void example1(){
        int n = 1;
        int except = 5;

        int actual = countSortedVowelStrings.countVowelStrings(n);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int n = 2;
        int except = 15;

        int actual = countSortedVowelStrings.countVowelStrings(n);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int n = 33;
        int except = 66045;

        int actual = countSortedVowelStrings.countVowelStrings(n);

        assertEquals(except, actual);
    }
}

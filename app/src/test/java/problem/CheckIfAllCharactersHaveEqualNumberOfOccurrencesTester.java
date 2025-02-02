package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTester {

    @Test
    public void example1(){
        String s = "abacbc";
        boolean actual = true;

        boolean result = CheckIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual(s);

        Assertions.assertEquals(actual, result);
    }

    @Test
    public void example2(){
        String s = "aaabb";
        boolean actual = false;

        boolean result = CheckIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual(s);

        Assertions.assertEquals(actual, result);
    }

    @Test
    public void example3(){
        String s = "abcd";
        boolean actual = true;

        boolean result = CheckIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual(s);

        Assertions.assertEquals(actual, result);
    }

    @Test
    public void example4(){
        String s = "a";
        boolean actual = true;

        boolean result = CheckIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual(s);

        Assertions.assertEquals(actual, result);
    }
}

package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorOfStringsTester {

    @Test
    public void example1(){
        String str1 = "ABCABC", str2 = "ABC";
        String result = "ABC";

        String actual = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String str1 = "ABABAB", str2 = "ABAB";
        String result = "AB";

        String actual = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        String str1 = "LEET", str2 = "CODE";
        String result = "";

        String actual = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        Assertions.assertEquals(result, actual);
    }
}

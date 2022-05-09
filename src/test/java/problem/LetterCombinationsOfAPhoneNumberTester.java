package problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCombinationsOfAPhoneNumberTester {

    LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void example1(){
        String digits = "23";
        List<String> except = new ArrayList<>(
                Arrays
                        .stream(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"})
                        .collect(Collectors.toUnmodifiableList()));

        List<String> actual = letterCombinationsOfAPhoneNumber.letterCombinations(digits);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        String digits = "";
        List<String> except = new ArrayList<>();

        List<String> actual = letterCombinationsOfAPhoneNumber.letterCombinations(digits);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        String digits = "2";
        List<String> except = new ArrayList<>(
                Arrays
                        .stream(new String[]{"a","b","c"})
                        .collect(Collectors.toUnmodifiableList()));

        List<String> actual = letterCombinationsOfAPhoneNumber.letterCombinations(digits);

        assertEquals(except, actual);
    }
}

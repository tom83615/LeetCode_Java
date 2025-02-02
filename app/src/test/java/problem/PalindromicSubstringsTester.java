package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstringsTester {
    PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

    @Test
    public void example1(){
        String s = "abc";
        int except = 3;

        int actual = palindromicSubstrings.countSubstrings(s);

        // "a", "b", "c"
        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        String s = "aaa";
        int except = 6;

        int actual = palindromicSubstrings.countSubstrings(s);

        // "a", "a", "a", "aa", "aa", "aaa"
        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        String s = "ababa";
        int except = 9;

        int actual = palindromicSubstrings.countSubstrings(s);

        // "a", "b", "a", "b", "a", "aba", "bab", "aba", "ababa"
        assertEquals(except, actual);
    }
}

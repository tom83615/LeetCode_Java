package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductOfWordLengthsTester {
    MaximumProductOfWordLengths maximumProductOfWordLengths = new MaximumProductOfWordLengths();

    @Test
    public void example1(){
        String[] words =  {"abcw","baz","foo","bar","xtfn","abcdef"};
        int except = 16;

        int actual = maximumProductOfWordLengths.maxProduct(words);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        String[] words =  {"a","ab","abc","d","cd","bcd","abcd"};
        int except = 4;

        int actual = maximumProductOfWordLengths.maxProduct(words);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        String[] words =  {"a","aa","aaa","aaaa"};
        int except = 0;

        int actual = maximumProductOfWordLengths.maxProduct(words);

        assertEquals(except, actual);
    }
}

package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestValidParenthesesTester {
    LongestValidParentheses longestValidParentheses = new LongestValidParentheses();


    @Test
    public void example1(){
        String s = "(()";

        int expect = 2;

        int actual = longestValidParentheses.longestValidParentheses(s);

        assertEquals(expect, actual);
    }

    @Test
    public void example2(){
        String s = ")()())";

        int expect = 4;

        int actual = longestValidParentheses.longestValidParentheses(s);

        assertEquals(expect, actual);
    }

    @Test
    public void example3(){
        String s = "";

        int expect = 0;

        int actual = longestValidParentheses.longestValidParentheses(s);

        assertEquals(expect, actual);
    }

    @Test
    public void example4(){
        String s = "(()())())";

        int expect = 8;

        int actual = longestValidParentheses.longestValidParentheses(s);

        assertEquals(expect, actual);
    }


    @Test
    public void example5(){
        String s = "()(()";

        int expect = 2;

        int actual = longestValidParentheses.longestValidParentheses(s);

        assertEquals(expect, actual);
    }



    @Test
    public void example6(){
        String s = "()(())";

        int expect = 6;

        int actual = longestValidParentheses.longestValidParentheses(s);

        assertEquals(expect, actual);
    }
}

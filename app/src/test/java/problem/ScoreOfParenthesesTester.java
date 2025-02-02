package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreOfParenthesesTester {
    @Test
    public void example1(){
        String s = "()";
        int result = 1;

        int actual = ScoreOfParentheses.scoreOfParentheses(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String s = "(())";
        int result = 2;

        int actual = ScoreOfParentheses.scoreOfParentheses(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        String s = "()()";
        int result = 2;

        int actual = ScoreOfParentheses.scoreOfParentheses(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        String s = "";
        int result = 0;

        int actual = ScoreOfParentheses.scoreOfParentheses(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        String s = "(()())";
        int result = 4;

        int actual = ScoreOfParentheses.scoreOfParentheses(s);

        Assertions.assertEquals(result, actual);
    }
}

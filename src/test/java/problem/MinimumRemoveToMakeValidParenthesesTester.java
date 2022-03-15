package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumRemoveToMakeValidParenthesesTester {
    @Test
    public void example1(){
        String s = "lee(t(c)o)de)";
        String result = "lee(t(c)o)de";

        String actual = MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String s = "a)b(c)d";
        String result = "ab(c)d";

        String actual = MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        String s = "))((";
        String result = "";

        String actual = MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s);

        Assertions.assertEquals(result, actual);
    }
}

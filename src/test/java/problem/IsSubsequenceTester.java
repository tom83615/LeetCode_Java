package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTester {

    @Test
    public void example1(){
        String s = "abc", t = "ahbgdc";
        Boolean result = true;

        boolean actual = IsSubsequence.isSubsequence(s, t);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String s = "axc", t = "ahbgdc";
        Boolean result = false;

        boolean actual = IsSubsequence.isSubsequence(s, t);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        String s = "abcd", t = "aadfsdfsadfasqwerqwqwerqwererdfasdfsafbasdfsadfasqwerqwerdfdsafasdfcasdfasdfasdfasdfasdfdqwerqewrasdfasdfasqerqwerqwerdfsadfasdf";
        Boolean result = true;

        boolean actual = IsSubsequence.isSubsequence(s, t);
        Assertions.assertEquals(result, actual);
    }
}

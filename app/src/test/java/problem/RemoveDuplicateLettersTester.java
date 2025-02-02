package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problem.object.ListNode;

public class RemoveDuplicateLettersTester {

    @Test
    public void example1(){
        String s = "bcabc";
        String result = "abc";
        String actual = RemoveDuplicateLetters.removeDuplicateLetters(s);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String s = "cbacdcbc";
        String result = "acdb";
        String actual = RemoveDuplicateLetters.removeDuplicateLetters(s);
        Assertions.assertEquals(result, actual);
    }
}

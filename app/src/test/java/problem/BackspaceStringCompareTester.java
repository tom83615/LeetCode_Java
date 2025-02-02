package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackspaceStringCompareTester {
    BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void example1(){
        String s = "ab#c", t = "ad#c";

        boolean actual = backspaceStringCompare.backspaceCompare(s, t);

        assertTrue(actual);
    }

    @Test
    public void example2(){
        String s = "ab##", t = "c#d#";

        boolean actual = backspaceStringCompare.backspaceCompare(s, t);

        assertTrue(actual);
    }

    @Test
    public void example3(){
        String s = "a#c", t = "b";

        boolean actual = backspaceStringCompare.backspaceCompare(s, t);

        Assertions.assertFalse(actual);
    }

    @Test
    public void example4(){
        String s = "#b", t = "a#b";

        boolean actual = backspaceStringCompare.backspaceCompare(s, t);

        Assertions.assertTrue(actual);
    }
}

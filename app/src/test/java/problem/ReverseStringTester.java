package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTester {

    @Test
    public void example1(){
        char[] s = {'h','e','l','l','o'};
        char[] result = {'o','l','l','e','h'};

        ReverseString.reverseString(s);
        Assertions.assertArrayEquals(result, s);
    }

    @Test
    public void example2(){
        char[] s = {'H','a','n','n','a','h'};
        char[] result = {'h','a','n','n','a','H'};

        ReverseString.reverseString(s);
        Assertions.assertArrayEquals(result, s);
    }

    @Test
    public void example3(){
        char[] s = {'H'};
        char[] result = {'H'};

        ReverseString.reverseString(s);
        Assertions.assertArrayEquals(result, s);
    }

    @Test
    public void example4(){
        char[] s = {'H','a'};
        char[] result = {'a','H'};

        ReverseString.reverseString(s);
        Assertions.assertArrayEquals(result, s);
    }

    @Test
    public void example5(){
        char[] s = {'H','a','c'};
        char[] result = {'c','a','H'};

        ReverseString.reverseString(s);
        Assertions.assertArrayEquals(result, s);
    }
}

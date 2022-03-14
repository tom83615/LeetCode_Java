package problem;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplifyPathTester {
    @Test
    public void example1(){
        String s = "/home/";
        String result = "/home";

        String actual = SimplifyPath.simplifyPath(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String s = "/../";
        String result = "/";

        String actual = SimplifyPath.simplifyPath(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        String s = "/home//foo/";
        String result = "/home/foo";

        String actual = SimplifyPath.simplifyPath(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        String s = "/";
        String result = "/";

        String actual = SimplifyPath.simplifyPath(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        String s = "/...";
        String result = "/...";

        String actual = SimplifyPath.simplifyPath(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example6(){
        String s = "/a/./b/../../c/";
        String result = "/c";

        String actual = SimplifyPath.simplifyPath(s);

        Assertions.assertEquals(result, actual);
    }
}

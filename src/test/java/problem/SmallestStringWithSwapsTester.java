package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestStringWithSwapsTester {

    SmallestStringWithSwaps smallestStringWithSwaps = new SmallestStringWithSwaps();

    @Test
    public void example1(){
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.stream(new int[]{0, 3}).boxed().collect(Collectors.toList()));
        pairs.add(Arrays.stream(new int[]{1, 2}).boxed().collect(Collectors.toList()));

        String expect = "bacd";

        String actual = smallestStringWithSwaps.smallestStringWithSwaps(s, pairs);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void example2(){
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.stream(new int[]{0, 3}).boxed().collect(Collectors.toList()));
        pairs.add(Arrays.stream(new int[]{1, 2}).boxed().collect(Collectors.toList()));
        pairs.add(Arrays.stream(new int[]{0, 2}).boxed().collect(Collectors.toList()));

        String expect = "abcd";

        String actual = smallestStringWithSwaps.smallestStringWithSwaps(s, pairs);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void example3(){
        String s = "cba";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.stream(new int[]{0, 1}).boxed().collect(Collectors.toList()));
        pairs.add(Arrays.stream(new int[]{1, 2}).boxed().collect(Collectors.toList()));

        String expect = "abc";

        String actual = smallestStringWithSwaps.smallestStringWithSwaps(s, pairs);
        Assertions.assertEquals(expect, actual);
    }
}

package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SortCharactersByFrequencyTester {

    @Test
    public void example1(){
        String s = "tree";
        String result = "eert";

        String actual = SortCharactersByFrequency.frequencySort(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        String s = "cccaaa";
        String result = "aaaccc";

        String actual = SortCharactersByFrequency.frequencySort(s);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        String s = "Aabb";
        String result = "bbAa";

        String actual = SortCharactersByFrequency.frequencySort(s);

        Assertions.assertEquals(result, actual);
    }
}

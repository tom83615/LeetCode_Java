package problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIIITester {
    CombinationSumIII combinationSumIII = new CombinationSumIII();

    @Test
    public void example1(){
        int k = 3, n = 7;
        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.stream(new int[]{1,2,4}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> actual = combinationSumIII.combinationSum3(k, n);
        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int k = 3, n = 9;
        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.stream(new int[]{1,2,6}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{1,3,5}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{2,3,4}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> actual = combinationSumIII.combinationSum3(k, n);
        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int k = 4, n = 1;
        List<List<Integer>> except = new ArrayList<>();

        List<List<Integer>> actual = combinationSumIII.combinationSum3(k, n);
        assertEquals(except, actual);
    }
}

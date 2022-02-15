package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetsTester {

    @Test
    public void example1(){
        int[] nums = {1,2,3};
        List<List<Integer>> Actual = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)
        );
        List<List<Integer>> result = Subsets.subsets(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        int[] nums = {0};
        List<List<Integer>> Actual = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(0)
        );

        List<List<Integer>> result = Subsets.subsets(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        int[] nums = {1,3};
        List<List<Integer>> Actual = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(3),
                Arrays.asList(1,3)
        );

        List<List<Integer>> result = Subsets.subsets(nums);

        Assertions.assertEquals(Actual, result);
    }
}

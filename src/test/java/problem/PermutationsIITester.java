package problem;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsIITester {
    PermutationsII permutationsII = new PermutationsII();

    @Test
    public void example1(){
        int[] nums = {1,1,2};
        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.stream(new int[]{1,1,2}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{2,1,1}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{1,2,1}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> actual = permutationsII.permuteUnique(nums);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] nums = {1,2,3};
        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.stream(new int[]{1,2,3}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{3,2,1}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{2,1,3}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{3,1,2}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{1,3,2}).boxed().collect(Collectors.toUnmodifiableList()));
        except.add(Arrays.stream(new int[]{2,3,1}).boxed().collect(Collectors.toUnmodifiableList()));

        List<List<Integer>> actual = permutationsII.permuteUnique(nums);

        assertEquals(except, actual);
    }
}

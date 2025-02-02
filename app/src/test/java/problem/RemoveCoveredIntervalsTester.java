package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveCoveredIntervalsTester {
    @Test
    public void example1(){
        int[][] nums  = {{1,4},{3,6},{2,8}};
        int Actual = 2;
        int result = RemoveCoveredIntervals.removeCoveredIntervals(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        int[][] nums  = {{1,4},{2,3}};
        int Actual = 1;
        int result = RemoveCoveredIntervals.removeCoveredIntervals(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        int[][] nums  = {{1,4},{2,5}};
        int Actual = 2;
        int result = RemoveCoveredIntervals.removeCoveredIntervals(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example4(){
        int[][] nums  = {{2,8},{1,8},{3,9}};
        int Actual = 2;
        int result = RemoveCoveredIntervals.removeCoveredIntervals(nums);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example5(){
        int[][] nums  = {{1,2},{3,4},{2,3}};
        int Actual = 3;
        int result = RemoveCoveredIntervals.removeCoveredIntervals(nums);

        Assertions.assertEquals(Actual, result);
    }
}

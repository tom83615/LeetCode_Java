package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathWithMinimumEffortTester {

    PathWithMinimumEffort pathWithMinimumEffort = new PathWithMinimumEffort();

    @Test
    public void example1(){
        int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};
        int except = 2;

        int actual = pathWithMinimumEffort.minimumEffortPath(heights);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[][] heights = {{1,2,3},{3,8,4},{5,3,5}};
        int except = 1;

        int actual = pathWithMinimumEffort.minimumEffortPath(heights);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[][] heights = {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        int except = 0;

        int actual = pathWithMinimumEffort.minimumEffortPath(heights);

        assertEquals(except, actual);
    }
}

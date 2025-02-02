package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingPathInAMatrixTester {

    LongestIncreasingPathInAMatrix longestIncreasingPathInAMatrix = new LongestIncreasingPathInAMatrix();

    @Test
    public void example1(){
        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        int except = 4;

        int actual = longestIncreasingPathInAMatrix.longestIncreasingPath(matrix);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[][] matrix = {{3,4,5},{3,2,6},{2,2,1}};
        int except = 4;

        int actual = longestIncreasingPathInAMatrix.longestIncreasingPath(matrix);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[][] matrix = {{1}};
        int except = 1;

        int actual = longestIncreasingPathInAMatrix.longestIncreasingPath(matrix);

        assertEquals(except, actual);
    }
}

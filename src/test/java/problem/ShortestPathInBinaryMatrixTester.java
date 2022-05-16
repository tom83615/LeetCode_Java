package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathInBinaryMatrixTester {

    ShortestPathInBinaryMatrix shortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();

    @Test
    public void example1(){
        int[][] grid = {{0,1},{1,0}};
        int except = 2;

        int actual = shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        int except = 4;

        int actual = shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[][] grid = {{1,0,0},{1,1,0},{1,1,0}};
        int except = -1;

        int actual = shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);

        assertEquals(except, actual);
    }

}

package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsIITester {

    UniquePathsII uniquePathsII = new UniquePathsII();

    @Test
    public void example1(){
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int except = 2;

        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[][] obstacleGrid = {{0,1},{0,0}};
        int except = 1;

        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[][] obstacleGrid = {{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0}};
        int except = 7;

        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(except, actual);
    }

    @Test
    public void example4(){
        int[][] obstacleGrid = {
                {0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0},
                {1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,1},
                {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0},
                {0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0},
                {1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0},
                {0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0},
                {0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0},
                {0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0},
                {0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1},
                {0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
                {1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,0},
                {0,0,0,1,0,0,0,0,1,1,1,0,0,1,0,1,1,0},
                {0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0},
                {0,0,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,0},
                {0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1},
                {0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0},
                {1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0},
                {1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,1},
                {1,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0}
        };
        int except = 13594824;

        int actual = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);

        assertEquals(except, actual);
    }
}

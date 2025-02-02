package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixTester {
    @Test
    public void example1(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean result = true;
        boolean actual = SearchA2DMatrix.searchMatrix(matrix, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean result = false;
        boolean actual = SearchA2DMatrix.searchMatrix(matrix, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int[][] matrix = {{1}};
        int target = 0;
        boolean result = false;
        boolean actual = SearchA2DMatrix.searchMatrix(matrix, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        int[][] matrix = {{1,3}};
        int target = 3;
        boolean result = true;
        boolean actual = SearchA2DMatrix.searchMatrix(matrix, target);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        int[][] matrix = {{1},{3}};
        int target = 3;
        boolean result = true;
        boolean actual = SearchA2DMatrix.searchMatrix(matrix, target);
        Assertions.assertEquals(result, actual);
    }
}

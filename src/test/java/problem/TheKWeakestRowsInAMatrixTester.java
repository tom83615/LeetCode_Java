package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheKWeakestRowsInAMatrixTester {
    @Test
    public void example1(){
        int[][] mat =
                {{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
        int k = 2;
        int[] result = {0,2};
        int[] actual = TheKWeakestRowsInAMatrix.kWeakestRows(mat, k);
        Assertions.assertArrayEquals(result, actual);
    }

    @Test
    public void example2(){
        int[][] mat =
                {{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int k = 3;
        int[] result = {2, 0, 3};
        int[] actual = TheKWeakestRowsInAMatrix.kWeakestRows(mat, k);
        Assertions.assertArrayEquals(result, actual);
    }
}

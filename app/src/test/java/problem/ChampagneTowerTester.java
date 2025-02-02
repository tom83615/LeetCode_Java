package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChampagneTowerTester {
    @Test
    public void example1(){
        int poured = 1, query_row = 1, query_glass = 1;
        double result =  0.0d;

        double actual = ChampagneTower.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int poured = 2, query_row = 1, query_glass = 1;
        double result =  0.5d;

        double actual = ChampagneTower.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int poured = 10000000, query_row = 33, query_glass = 17;
        double result =  1.0d;

        double actual = ChampagneTower.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        int poured = 9, query_row = 3, query_glass = 0;
        double result =  0.25d;

        double actual = ChampagneTower.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example5(){
        int poured = 9, query_row = 3, query_glass = 1;
        double result =  1.0d;

        double actual = ChampagneTower.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example6(){
        int poured = 10, query_row = 3, query_glass = 0;
        double result =  0.375d;

        double actual = ChampagneTower.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(result, actual);
    }
}

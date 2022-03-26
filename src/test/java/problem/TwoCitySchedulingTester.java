package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoCitySchedulingTester {

    @Test
    public void example1(){
        int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        int result = 110;
        int actual = TwoCityScheduling.twoCitySchedCost(costs);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        int result = 1859;
        int actual = TwoCityScheduling.twoCitySchedCost(costs);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int[][] costs =  {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        int result = 3086;
        int actual = TwoCityScheduling.twoCitySchedCost(costs);
        Assertions.assertEquals(result, actual);
    }
}

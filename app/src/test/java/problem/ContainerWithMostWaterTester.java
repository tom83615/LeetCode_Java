package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTester {

    @Test
    public void example1(){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = 49;

        int actual = ContainerWithMostWater.maxArea(height);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[] height = {1,1};
        int result = 1;

        int actual = ContainerWithMostWater.maxArea(height);
        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int[] height = {1,2,1};
        int result = 2;

        int actual = ContainerWithMostWater.maxArea(height);
        Assertions.assertEquals(result, actual);
    }
}

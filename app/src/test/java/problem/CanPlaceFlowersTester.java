package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTester {

    @Test
    public void example1(){
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        boolean Actual = false;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        int[] flowerbed = {1,0,0,0,1,0,0,1};
        int n = 2;
        boolean Actual = false;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example4(){
        int[] flowerbed = {1,1,0,0,0,0,0,1};
        int n = 2;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example5(){
        int[] flowerbed = {1,0,1,0,1,0,1};
        int n = 0;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example6(){
        int[] flowerbed = {0,0,1,0,1};
        int n = 1;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example7(){
        int[] flowerbed = {1,0,0};
        int n = 1;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example8(){
        int[] flowerbed = {0};
        int n = 1;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example9(){
        int[] flowerbed = {0,0};
        int n = 1;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example10(){
        int[] flowerbed = {0};
        int n = 0;
        boolean Actual = true;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(Actual, result);
    }
}

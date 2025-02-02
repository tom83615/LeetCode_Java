package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkDelayTimeTester {
    NetworkDelayTime networkDelayTime = new NetworkDelayTime();

    @Test
    public void example1(){
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;
        int except = 2;

        int actual = networkDelayTime.networkDelayTime(times, n, k);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[][] times = {{1,2,1}};
        int n = 2, k = 1;
        int except = 1;

        int actual = networkDelayTime.networkDelayTime(times, n, k);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[][] times = {{1,2,1}};
        int n = 2, k = 2;
        int except = -1;

        int actual = networkDelayTime.networkDelayTime(times, n, k);

        assertEquals(except, actual);
    }
}

package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTester {
    CoinChange coinChange = new CoinChange();

    @Test
    public void example1(){
        int[] coins = {1,2,5};
        int amount = 11;

        int except = 3;

        int actual = coinChange.coinChange(coins, amount);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[] coins = {2};
        int amount = 3;

        int except = -1;

        int actual = coinChange.coinChange(coins, amount);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[] coins = {1};
        int amount = 0;

        int except = 0;

        int actual = coinChange.coinChange(coins, amount);

        assertEquals(except, actual);
    }


    @Test
    public void example4(){
        int[] coins = {1,2,5};
        int amount = 100;

        int except = 20;

        int actual = coinChange.coinChange(coins, amount);

        assertEquals(except, actual);
    }

    @Test
    public void example5(){
        int[] coins = {186,419,83,408};
        int amount = 6249;

        int except = 20;

        int actual = coinChange.coinChange(coins, amount);

        assertEquals(except, actual);
    }
}

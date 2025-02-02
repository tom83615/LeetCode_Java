package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RussianDollEnvelopesTester {
    RussianDollEnvelopes russianDollEnvelopes = new RussianDollEnvelopes();

    @Test
    public void example1(){
        int[][] envelopes = {{5,4},{6,4},{6,7},{2,3}};
        int except = 3;

        int actual = russianDollEnvelopes.maxEnvelopes(envelopes);

        assertEquals(except, actual);
    }

    @Test
    public void example2(){
        int[][] envelopes = {{1,1},{1,1},{1,1}};
        int except = 1;

        int actual = russianDollEnvelopes.maxEnvelopes(envelopes);

        assertEquals(except, actual);
    }

    @Test
    public void example3(){
        int[][] envelopes = {};
        int except = 0;

        int actual = russianDollEnvelopes.maxEnvelopes(envelopes);

        assertEquals(except, actual);
    }


    @Test
    public void example4(){
        int[][] envelopes = {{1,1},{3,10},{4,11},{5,5},{6,6},{7,7}};
        int except = 4;

        int actual = russianDollEnvelopes.maxEnvelopes(envelopes);

        assertEquals(except, actual);
    }
}

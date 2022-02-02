package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColorTester {

    @Test
    public void example1(){
        String colors = "AAABABB";
        boolean result = true;

        boolean re = RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors);

        Assertions.assertEquals(re, result);
    }

    @Test
    public void example2(){
        String colors = "AA";
        boolean result = false;

        boolean re = RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors);

        Assertions.assertEquals(re, result);
    }

    @Test
    public void example3(){
        String colors = "ABBBBBBBAAA";
        boolean result = false;

        boolean re = RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors);

        Assertions.assertEquals(re, result);
    }
}

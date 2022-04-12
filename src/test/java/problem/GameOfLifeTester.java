package problem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GameOfLifeTester {

    @Test
    public void example1(){
        int[][] board  = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] actual = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};

        GameOfLife.gameOfLife(board);
        assertArrayEquals(board, actual);
    }

    @Test
    public void example2(){
        int[][] board  = {{1,1},{1,0}};
        int[][] actual = {{1,1},{1,1}};

        GameOfLife.gameOfLife(board);
        assertArrayEquals(board, actual);
    }

    @Test
    public void example3(){
        int[][] board  = {{0,0}};
        int[][] actual = {{0,0}};

        GameOfLife.gameOfLife(board);
        assertArrayEquals(board, actual);
    }

    @Test
    public void example4(){
        int[][] board  = {{1}};
        int[][] actual = {{0}};

        GameOfLife.gameOfLife(board);
        assertArrayEquals(board, actual);
    }

    @Test
    public void example5(){
        int[][] board  = {{1,1,1}};
        int[][] actual = {{0,0,0}};

        GameOfLife.gameOfLife(board);
        assertArrayEquals(board, actual);
    }

    @Test
    public void example6(){
        int[][] board  = {{0,0,0,0,0,0},{0,0,1,1,0,0},{0,1,0,0,1,0},{0,0,1,1,0,0},{0,0,0,0,0,0}};
        int[][] actual = {{0,0,0,0,0,0},{0,0,1,1,0,0},{0,1,0,0,1,0},{0,0,1,1,0,0},{0,0,0,0,0,0}};

        GameOfLife.gameOfLife(board);
        assertArrayEquals(board, actual);
    }
}

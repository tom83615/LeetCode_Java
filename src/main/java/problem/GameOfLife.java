package problem;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int lengx = board.length;
        int lengy = board[0].length;

        // all dead matrix
        if(lengx < 2 || lengy < 2){
            for(int x=0; x<lengx; x++){
                for(int y=0; y<lengy; y++){
                    board[x][y] = 0;
                }
            }
            return;
        }

        //extend board
        int[][] extendBoard = new int[lengx+2][lengy+2];
        for(int x=0; x<lengx; x++){
            for(int y=0; y<lengy; y++){
                extendBoard[x+1][y+1] = board[x][y];
            }
        }

        for(int i=1; i<lengx+1; i++){
            for(int j=1; j<lengy+1; j++){
                int count = countNeighbors(extendBoard, i, j);
                board[i-1][j-1] = (count == 3 || count == 2 && extendBoard[i][j] == 1)? 1: 0;
            }
        }
    }

    public static int countNeighbors (int[][] board, int x, int y) {
        int cunt = 0;
        for(int i=x-1; i<=x+1; i++){
            cunt += board[i][y-1] + board[i][y] + board[i][y+1];
        }
        return cunt - board[x][y];
    }
}

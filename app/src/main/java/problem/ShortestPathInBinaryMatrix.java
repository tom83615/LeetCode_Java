package problem;

import java.util.*;

public class ShortestPathInBinaryMatrix {
//    Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.
//    A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:
//    All the visited cells of the path are 0.
//    All the adjacent cells of the path are 8-directionally connected (i.e., they are different and they share an edge or a corner).
//    The length of a clear path is the number of visited cells of this path.
//
//
//
//    Example 1:
//    Input: grid = [[0,1],[1,0]]
//    Output: 2
//
//    Example 2:
//    Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
//    Output: 4
//
//    Example 3:
//    Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
//    Output: -1
//
//
//    Constraints:
//    n == grid.length
//    n == grid[i].length
//    1 <= n <= 100
//    grid[i][j] is 0 or 1

    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int len = grid.length;

        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0,1});
        grid[0][0]=1;

        while(!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                int[] now = queue.poll();
                if(now[0] == len-1 && now[1] == len-1){
                    return now[2];
                }
                for(int i=-1; i<=1; i++){
                    for(int j=-1; j<=1; j++){
                        int newX = now[0]+i, newY = now[1]+j;
                        if(newX>=0 && newY>=0 && newX<len && newY<len && grid[newX][newY]==0){
                            queue.add(new int[]{newX, newY, now[2]+1});
                            grid[newX][newY]=1;
                        }
                    }
                }

            }
        }

        return -1;
    }
}

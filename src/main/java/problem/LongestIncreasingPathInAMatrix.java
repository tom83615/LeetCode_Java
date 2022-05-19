package problem;

import java.util.Arrays;

public class LongestIncreasingPathInAMatrix {

//    Given an m x n integers matrix, return the length of the longest increasing path in matrix.
//
//    From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).
//
//
//
//    Example 1:
//    Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
//    Output: 4
//    Explanation: The longest increasing path is [1, 2, 6, 9].
//
//    Example 2:
//    Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
//    Output: 4
//    Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
//
//    Example 3:
//    Input: matrix = [[1]]
//    Output: 1
//
//
//    Constraints:
//    m == matrix.length
//    n == matrix[i].length
//    1 <= m, n <= 200
//    0 <= matrix[i][j] <= 231 - 1

    int[][] pathMap;
    public int longestIncreasingPath(int[][] matrix) {
        int lenX = matrix.length, lenY = matrix[0].length;
        pathMap = new int[lenX][lenY];
        int[][] paths ={{0,1},{0,-1},{1,0},{-1,0}};

        int maxPath = 0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                maxPath = Math.max(maxPath, dfs(matrix, i, j, lenX, lenY, paths));
            }
        }

        return maxPath;
    }

    public int dfs(int[][] matrix, int x, int y, int lenX, int lenY, int[][] paths) {
        if (pathMap[x][y] != 0){
            return pathMap[x][y];
        }

        for (int[] path : paths){
            int newX = x+path[0], newY =y+path[1];
            if( newX>=0 && newX < lenX &&
                newY>=0 && newY < lenY &&
                matrix[newX][newY] > matrix[x][y] ){

                pathMap[x][y] = Math.max(pathMap[x][y], dfs(matrix, newX, newY, lenX, lenY, paths));
            }
        }

       return ++pathMap[x][y];
    }
}

package problem;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PathWithMinimumEffort {
    //    You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
//
//    A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
//
//    Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
//
//    Example 1:
//    Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
//    Output: 2
//    Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
//    This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.
//
//    Example 2:
//    Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
//    Output: 1
//    Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells, which is better than route [1,3,5,3,5].
//
//    Example 3:
//    Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
//    Output: 0
//    Explanation: This route does not require any effort.
//
//
//    Constraints:
//    rows == heights.length
//    columns == heights[i].length
//    1 <= rows, columns <= 100
//    1 <= heights[i][j] <= 106
    public int minimumEffortPath(int[][] heights) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] v = new boolean[heights.length][heights[0].length];

        // {x, y, effort}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(s -> s[2]));

        //start point
        pq.add(new int[]{0, 0, 0});

        int maxEffort = -1;
        while (!pq.isEmpty()) {
            int[] s = pq.poll();
            int x = s[0];
            int y = s[1];
            v[x][y] = true;

            int effort = s[2];
            maxEffort = Math.max(effort, maxEffort);

            if (x == heights.length - 1 && y == heights[0].length - 1) {
                return maxEffort;
            }

            for (int d = 0; d < 4; d++) {
                int x_n = x + dx[d];
                int y_n = y + dy[d];

                if (0 <= x_n && x_n < heights.length && 0 <= y_n && y_n < heights[0].length && // over bound
                        !v[x_n][y_n])  // visited
                {
                    int e_n = Math.abs(heights[x_n][y_n] - heights[x][y]);
                    pq.add(new int[]{x_n, y_n, e_n});
                }
            }

        }

        return 0; //dummy return
    }
}

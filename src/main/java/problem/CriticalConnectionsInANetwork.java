package problem;

import java.util.*;

public class CriticalConnectionsInANetwork {
//    There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections forming a network where connections[i] = [ai, bi] represents a connection between servers ai and bi. Any server can reach other servers directly or indirectly through the network.
//    A critical connection is a connection that, if removed, will make some servers unable to reach some other server.
//    Return all critical connections in the network in any order.
//
//
//
//    Example 1:
//    Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
//    Output: [[1,3]]
//    Explanation: [[3,1]] is also accepted.
//
//    Example 2:
//    Input: n = 2, connections = [[0,1]]
//    Output: [[0,1]]
//
//
//    Constraints:
//    2 <= n <= 105
//    n - 1 <= connections.length <= 105
//    0 <= ai, bi <= n - 1
//    ai != bi
//    There are no repeated connections.

    int[] disc, low;
    int time;
    List<List<Integer>> ans = new ArrayList<>();
    Map<Integer,List<Integer>> edgeMap = new HashMap<>();

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        disc = new int[n];
        low = new int[n];
        time = 1;
        for (int i = 0; i < n; i++){
            edgeMap.put(i, new ArrayList<>());
        }

        for (List<Integer> list : connections) {
            edgeMap.get(list.get(0)).add(list.get(1));
            edgeMap.get(list.get(1)).add(list.get(0));
        }
        dfs(0, -1);
        return ans;
    }
    public void dfs(int curr, int prev) {
        disc[curr] = low[curr] = time++;

        for (int next : edgeMap.get(curr)) {
            if (disc[next] == 0) {
                dfs(next, curr);
                low[curr] = Math.min(low[curr], low[next]);
            } else if (next != prev){
                low[curr] = Math.min(low[curr], disc[next]);
            }

            if (low[next] > disc[curr]) {
                ans.add(Arrays.asList(curr, next));
            }
        }
    }
}

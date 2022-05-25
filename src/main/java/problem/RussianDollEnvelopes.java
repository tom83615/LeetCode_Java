package problem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes {

//    You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
//    One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
//    Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).
//    Note: You cannot rotate an envelope.
//
//    Example 1:
//    Input: envelopes = [[5,4],[6,4],[6,7],[2,3]]
//    Output: 3
//    Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
//    Example 2:
//    Input: envelopes = [[1,1],[1,1],[1,1]]
//    Output: 1
//    Constraints:
//
//    1 <= envelopes.length <= 105
//    envelopes[i].length == 2
//    1 <= wi, hi <= 105

    public int maxEnvelopes(int[][] envelopes) {
        // 2D LIS
        // the second dimension(Height) is decreed If width is equals.
        // prevent it counter add.
        Arrays.sort(envelopes, (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int[] dp = new int[envelopes.length];
        int ans = 0;
        for (int[] env : envelopes) {
            int height = env[1];
            int left = Arrays.binarySearch(dp, 0, ans, height);
            if (left < 0){
                left = -left - 1;
            }
            if (left == ans){
                ans++;
            }

            dp[left] = height;
        }
        return ans;
    }

}

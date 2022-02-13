package problem;

//        You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//
//        Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
//
//        Example 1:
//
//        Input: flowerbed = [1,0,0,0,1], n = 1
//        Output: true
//
//        Example 2:
//
//        Input: flowerbed = [1,0,0,0,1], n = 2
//        Output: false
//
//
//        Constraints:
//
//        1 <= flowerbed.length <= 2 * 104
//        flowerbed[i] is 0 or 1.
//        There are no two adjacent flowers in flowerbed.
//        0 <= n <= flowerbed.length

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n <=0) return true;
        int zeros = 1, ans = 0;
        for (int i : flowerbed) {
            if (i == 0) {
                ++zeros;
            } else {
                ans += (zeros - 1) / 2; // 000 => 1, 0000 => 1, 00000 => 2
                if(ans >= n) return true;
                zeros = 0;
            }
        }
        return ans + zeros / 2 >= n; // 00^ => 1, 000^ => 1, 000^ => 2
    }
}

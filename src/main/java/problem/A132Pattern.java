package problem;

import java.util.ArrayDeque;
import java.util.Deque;

public class A132Pattern {

    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int k = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k > -1 && nums[k] > nums[i]) {
                return true;
            }

            while (!deque.isEmpty() && nums[i] > nums[deque.peek()]) {
                k = deque.pop();
            }

            deque.push(i);
        }

        return false;
    }
}

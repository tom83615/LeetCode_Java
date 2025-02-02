package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int expectSum = (nums.length*(nums.length+1))/2;
        int currSum = Arrays.stream(nums).sum();

        return expectSum-currSum;
    }
}

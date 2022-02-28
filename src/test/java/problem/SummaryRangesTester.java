package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesTester {

    @Test
    public void example1(){
        int[] nums = {0,1,2,4,5,7};
        List<String> result = new ArrayList<>();
        result.add("0->2");
        result.add("4->5");
        result.add("7");

        List<String> actual = SummaryRanges.summaryRanges(nums);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example2(){
        int[] nums = {0,2,3,4,6,8,9};
        List<String> result = new ArrayList<>();
        result.add("0");
        result.add("2->4");
        result.add("6");
        result.add("8->9");

        List<String> actual = SummaryRanges.summaryRanges(nums);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example3(){
        int[] nums = {};
        List<String> result = new ArrayList<>();

        List<String> actual = SummaryRanges.summaryRanges(nums);

        Assertions.assertEquals(result, actual);
    }

    @Test
    public void example4(){
        int[] nums = {1};
        List<String> result = new ArrayList<>();
        result.add("1");
        List<String> actual = SummaryRanges.summaryRanges(nums);

        Assertions.assertEquals(result, actual);
    }
}

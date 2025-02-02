package problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnNumberTester {
    @Test
    public void example1(){
        String columnTitle = "A";
        int Actual = 1;
        int result = ExcelSheetColumnNumber.titleToNumber(columnTitle);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example2(){
        String columnTitle = "AB";
        int Actual = 28;
        int result = ExcelSheetColumnNumber.titleToNumber(columnTitle);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example3(){
        String columnTitle = "ZY";
        int Actual = 701;
        int result = ExcelSheetColumnNumber.titleToNumber(columnTitle);

        Assertions.assertEquals(Actual, result);
    }

    @Test
    public void example4(){
        String columnTitle = "FXSHRXW";
        int Actual = Integer.MAX_VALUE;
        int result = ExcelSheetColumnNumber.titleToNumber(columnTitle);

        Assertions.assertEquals(Actual, result);
    }

}

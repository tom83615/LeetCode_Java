package problem;

public class ExcelSheetColumnNumber {

    //Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
    //
    //For example:
    //
    //A -> 1
    //B -> 2
    //C -> 3
    //...
    //Z -> 26
    //AA -> 27
    //AB -> 28
    //...
    //
    //
    //Example 1:
    //
    //Input: columnTitle = "A"
    //Output: 1
    //Example 2:
    //
    //Input: columnTitle = "AB"
    //Output: 28
    //Example 3:
    //
    //Input: columnTitle = "ZY"
    //Output: 701
    //
    //
    //Constraints:
    //
    //1 <= columnTitle.length <= 7
    //columnTitle consists only of uppercase English letters.
    //columnTitle is in the range ["A", "FXSHRXW"].

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char c : columnTitle.toCharArray()){
            sum = sum*26 + (int) c - 64;
        }
        return sum;
    }
}

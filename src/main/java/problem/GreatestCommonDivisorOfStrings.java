package problem;

public class GreatestCommonDivisorOfStrings {
//    For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
//
//    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//
//
//    Example 1:
//
//    Input: str1 = "ABCABC", str2 = "ABC"
//    Output: "ABC"
//    Example 2:
//
//    Input: str1 = "ABABAB", str2 = "ABAB"
//    Output: "AB"
//    Example 3:
//
//    Input: str1 = "LEET", str2 = "CODE"
//    Output: ""
//
//
//    Constraints:
//
//            1 <= str1.length, str2.length <= 1000
//    str1 and str2 consist of English uppercase letters.

    public static String gcdOfStrings(String str1, String str2) {
        int common = findGreatestCommonDivisor(str1.length(), str2.length());
        if(     str1.equals( str2.substring(0, common).repeat(str1.length()/common) ) &&
                str2.equals( str1.substring(0, common).repeat(str2.length()/common) )
        ){
            return str1.substring(0, common);
        }
        return "";
    }
    public static int findGreatestCommonDivisor(int a, int b){
        if(b == 0){
            return a;
        }
        return findGreatestCommonDivisor(b, a % b);
    }
}

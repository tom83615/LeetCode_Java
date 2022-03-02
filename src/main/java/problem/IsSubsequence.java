package problem;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class IsSubsequence {
//    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//    Example 1:
//    Input: s = "abc", t = "ahbgdc"
//    Output: true
//
//    Example 2:
//    Input: s = "axc", t = "ahbgdc"
//    Output: false
//
//    Constraints:
//
//            0 <= s.length <= 100
//            0 <= t.length <= 104
//    s and t consist only of lowercase English letters.
    public static boolean isSubsequence(String s, String t) {
        if(s.length() < 1){return true;}
        Queue<Character> qu = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedList::new));

        char curr = qu.poll();
        for(char ct: t.toCharArray()){
            if(curr == ct){
                if(qu.isEmpty()){
                    return true;
                }else{
                    curr = qu.poll();
                }
            }
        }
        return false;
    }
}

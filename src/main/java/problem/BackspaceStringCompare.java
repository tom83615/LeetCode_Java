package problem;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

public class BackspaceStringCompare {
//    Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//
//    Note that after backspacing an empty text, the text will continue empty.
//
//
//
//    Example 1:
//    Input: s = "ab#c", t = "ad#c"
//    Output: true
//    Explanation: Both s and t become "ac".
//
//    Example 2:
//    Input: s = "ab##", t = "c#d#"
//    Output: true
//    Explanation: Both s and t become "".
//
//    Example 3:
//    Input: s = "a#c", t = "b"
//    Output: false
//    Explanation: s becomes "c" while t becomes "b".
//
//
//    Constraints:
//    1 <= s.length, t.length <= 200
//    s and t only contain lowercase letters and '#' characters.
    public boolean backspaceCompare(String s, String t) {
        String pS = pureString(s);
        String pT = pureString(t);
        return pS.equals(pT);
    }

    public String pureString(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#'){
                try {
                    stack.pop();
                }catch (Exception e){
                    // nothing
                }
            }else{
                stack.add(c);
            }
        }

        return stack.toString();
    }
}

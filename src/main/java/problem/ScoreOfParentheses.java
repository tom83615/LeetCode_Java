package problem;

import java.util.Stack;

public class ScoreOfParentheses {
//    Given a balanced parentheses string s, return the score of the string.
//
//    The score of a balanced parentheses string is based on the following rule:
//
//    "()" has score 1.
//    AB has score A + B, where A and B are balanced parentheses strings.
//    (A) has score 2 * A, where A is a balanced parentheses string.
//
//
//    Example 1:
//    Input: s = "()"
//    Output: 1
//
//    Example 2:
//    Input: s = "(())"
//    Output: 2
//
//    Example 3:
//    Input: s = "()()"
//    Output: 2
//
//    Constraints:
//
//            2 <= s.length <= 50
//    s consists of only '(' and ')'.
//    s is a balanced parentheses string.
    public static int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == ')'){
                int temp = 0;
                while (!stack.isEmpty()){
                    char pop = stack.pop();
                    if(pop == '('){
                        if(temp == 0){
                            temp += 1;
                        }else{
                            temp *= 2;
                        }
                        break;
                    }else{
                        temp += pop - 48; //"0": 48
                    }
                }
                stack.push((char) (temp + '0'));
            }else{
                stack.push(c);
            }
        }
        int result = 0;
        while (!stack.isEmpty()){
            result += stack.pop() - 48; //"0": 48
        }

        return result;
    }
}

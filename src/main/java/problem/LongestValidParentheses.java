package problem;

import java.util.LinkedList;
import java.util.Stack;

public class LongestValidParentheses {
//    Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
//
//    Example 1:
//    Input: s = "(()"
//    Output: 2
//    Explanation: The longest valid parentheses substring is "()".
//
//    Example 2:
//    Input: s = ")()())"
//    Output: 4
//    Explanation: The longest valid parentheses substring is "()()".
//
//    Example 3:
//    Input: s = ""
//    Output: 0
//
//    Constraints:
//    0 <= s.length <= 3 * 104
//    s[i] is '(', or ')'.
    public int longestValidParentheses(String s) {
        Stack <Integer> stack = new Stack<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }
}

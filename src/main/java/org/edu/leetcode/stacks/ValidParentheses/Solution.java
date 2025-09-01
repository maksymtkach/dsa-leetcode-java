package org.edu.leetcode.stacks.ValidParentheses;

import java.awt.color.ICC_ColorSpace;
import java.util.*;

/// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
/// determine if the input string is valid.
/// The string is valid if all open brackets are closed by the same type of closing bracket in the correct order,
/// and each closing bracket closes exactly one open bracket.
/// For example, s = "({})" and s = "(){}[]" are valid, but s = "(]" and s = "({)}" are not valid.

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parentheses
                = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        parentheses.put('{', '}');

        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (parentheses.containsKey(c)) {
                // open
                stack.push(c);
            } else {
                // close
                if (stack.isEmpty() || // the stack has no prev elements -> false
                        parentheses.get(stack.pop()) != c) { // check if last is close so close is invalid
                    return false;
                }
            }
        }

        return stack.isEmpty(); // if stack isn't empty it contains invalid set of parentheses
    }
}

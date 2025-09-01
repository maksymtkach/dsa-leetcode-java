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
            if (!stack.empty() &&
                    (parentheses.containsKey(stack.peek()) &&
                            c == parentheses.get(stack.peek()))) {
                stack.pop();
            } else if (parentheses.containsKey(c)){
                stack.push(c);
            }
        }

        return stack.empty();
    }
}

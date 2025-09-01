package org.edu.leetcode.stacks.RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

/// You are given a string s.
/// Continuously remove duplicates (two of the same character beside each other) until you can't anymore.
/// Return the final string after this.
/// For example, given s = "abbaca", you can first remove the "bb" to get "aaca".
/// Next, you can remove the "aa" to get "ca".
/// This is the final answer.

public class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}

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
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}

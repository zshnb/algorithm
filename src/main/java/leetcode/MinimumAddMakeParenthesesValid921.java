package leetcode;

import java.util.ArrayDeque;

/**
 * 思路1：使用栈，当遇到左括号入栈，遇到右括号时看栈顶是否为左括号，是的话出栈，否则右括号入栈，最后返回栈的size即可
 * */
public class MinimumAddMakeParenthesesValid921 {
    public int minAddToMakeValid(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                queue.addFirst(aChar);
            } else {
                if (!queue.isEmpty() && queue.peek() == '(') {
                    queue.pop();
                } else {
                    queue.addFirst(aChar);
                }
            }
        }
        return queue.size();
    }
}

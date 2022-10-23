package leetcode;

import java.util.ArrayDeque;

/**
 * 思路1：使用栈，当遇到左括号入栈，遇到右括号时看栈顶是否为左括号，是的话出栈，否则右括号入栈，最后返回栈的size即可
 * 思路2：和前面思路类似，但不使用栈，在遍历字符串时以左括号为基准，当遇到左括号时右括号需求数+1，当遇到右括号时需求数-1，如果需求数为负数
 * 说明没有左括号与之匹配，结果+1，重置需求数，最后返回需求数+结果
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

    int minAddToMakeValid2(String s) {
        // res 记录插入次数
        int res = 0;
        // need 变量记录右括号的需求量
        int need = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // 对右括号的需求 + 1
                need++;
            }

            if (s.charAt(i) == ')') {
                // 对右括号的需求 - 1
                need--;

                if (need == -1) {
                    need = 0;
                    // 需插入一个左括号
                    res++;
                }
            }
        }

        return res + need;
    }
}

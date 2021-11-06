package leetcode;

import java.util.ArrayDeque;

/**
 * 思路1：使用栈，遇到左括号推入栈，每当遇到右括号查看栈顶元素，如果栈空返回false，如果栈顶不是对应左括号返回false
 * */
public class ValidParentheses20 {
    public boolean isValid(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                queue.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (queue.isEmpty()) return false;
                char p = queue.pop();
                if ((c == ')' && p != '(') || (c == '}' && p != '{') || (c == ']' && p != '[')) {
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 思路1：递归，把表达式从运算符处拆分成左右2个子表达式，递归计算出结果集后，根据当前运算符，合并2个子表达式的结果集，比如2-1-1拆成2-(1-1)
 * */
public class DifferentWaysToAddParentheses241 {
    public List<Integer> diffWaysToCompute(String expression) {
        if (Pattern.matches("\\d+", expression)) {
            return List.of(Integer.parseInt(expression));
        }
        char[] chars = expression.toCharArray();
        List<Integer> result = new ArrayList<>();
        for (int i = 0;i < chars.length;i++) {
            char ch = chars[i];
            if (ch == '+' || ch == '-' || ch == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (Integer l : left) {
                    for (Integer r : right) {
                        switch (ch) {
                            case '+': result.add(l + r); break;
                            case '-': result.add(l - r); break;
                            case '*': result.add(l * r); break;
                        }
                    }
                }
            }
        }
        return result;
    }
}

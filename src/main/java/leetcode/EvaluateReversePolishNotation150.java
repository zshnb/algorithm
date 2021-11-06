package leetcode;

import java.util.ArrayDeque;

/**
 * 使用栈，遇到数字入栈，遇到操作符弹出2个数字，根据操作符处理完后再入栈
 * */
public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> numQueue = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num1 = numQueue.pop();
                int num2 = numQueue.pop();
                int res = 0;
                switch (token) {
                    case "+": {
                        res = num1 + num2;
                        break;
                    }
                    case "-": {
                        res = num2 - num1;
                        break;
                    }
                    case "*": {
                        res = num1 * num2;
                        break;
                    }
                    case "/": {
                        res = num2 / num1;
                        break;
                    }
                }
                numQueue.push(res);
            } else {
                numQueue.push(Integer.valueOf(token));
            }
        }
        return numQueue.pop();
    }
}

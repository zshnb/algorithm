package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotation150Test {
    private EvaluateReversePolishNotation150 instance = new EvaluateReversePolishNotation150();

    @Test
    public void test() {
        Assertions.assertEquals(6, instance.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        Assertions.assertEquals(9, instance.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        Assertions.assertEquals(27, instance.evalRPN(new String[]{"-2", "11", "+", "3", "*"}));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParentheses20Test {
    private ValidParentheses20 instance = new ValidParentheses20();

    @Test
    public void test() {
        Assertions.assertTrue(instance.isValid("()"));
        Assertions.assertTrue(instance.isValid("()[]{}"));
        Assertions.assertFalse(instance.isValid("([)]"));
        Assertions.assertFalse(instance.isValid("]"));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreParentheses856Test {
    @Test
    public void successful() {
        ScoreParentheses856 obj = new ScoreParentheses856();
        Assertions.assertEquals(3, obj.scoreOfParentheses("(())()"));
        Assertions.assertEquals(6, obj.scoreOfParentheses("(()(()))"));
        Assertions.assertEquals(2, obj.scoreOfParentheses("()()"));
        Assertions.assertEquals(2, obj.scoreOfParentheses("(())"));
        Assertions.assertEquals(1, obj.scoreOfParentheses("()"));
    }
}

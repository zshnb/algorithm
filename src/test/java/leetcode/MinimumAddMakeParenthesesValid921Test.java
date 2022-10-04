package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAddMakeParenthesesValid921Test {
    @Test
    public void successful() {
        MinimumAddMakeParenthesesValid921 obj = new MinimumAddMakeParenthesesValid921();
        Assertions.assertEquals(1, obj.minAddToMakeValid("())"));
        Assertions.assertEquals(3, obj.minAddToMakeValid("((("));
    }
}

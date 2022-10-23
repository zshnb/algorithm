package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumInsertionsBalanceParenthesesString1541Test {
    @Test
    public void successful() {
        MinimumInsertionsBalanceParenthesesString1541 obj = new MinimumInsertionsBalanceParenthesesString1541();
        Assertions.assertEquals(1, obj.minInsertions("(()))"));
        Assertions.assertEquals(5, obj.minInsertions(")))))))"));
        Assertions.assertEquals(0, obj.minInsertions("())"));
        Assertions.assertEquals(3, obj.minInsertions("))())("));
        Assertions.assertEquals(12, obj.minInsertions("(((((("));
    }
}

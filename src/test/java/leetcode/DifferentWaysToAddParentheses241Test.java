package leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

public class DifferentWaysToAddParentheses241Test extends BaseTest {
    @Test
    public void successful() {
        DifferentWaysToAddParentheses241 obj = new DifferentWaysToAddParentheses241();
        assertListEquals(List.of(11), obj.diffWaysToCompute("11"));
        obj.diffWaysToCompute("2*3-4*5");
        obj.diffWaysToCompute("2-1-1");
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePaths62Test {
    @Test
    public void successful() {
        UniquePaths62 obj = new UniquePaths62();
        Assertions.assertEquals(28, obj.uniquePaths(3, 7));
    }
}

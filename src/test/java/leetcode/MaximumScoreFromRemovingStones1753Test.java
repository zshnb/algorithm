package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumScoreFromRemovingStones1753Test {
    @Test
    public void successful() {
        MaximumScoreFromRemovingStones1753 obj = new MaximumScoreFromRemovingStones1753();
        Assertions.assertEquals(8, obj.maximumScore(1, 8, 8));
        Assertions.assertEquals(6, obj.maximumScore(2, 4, 6));
    }
}

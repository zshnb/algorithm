package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumQueryImmutable303Test {
    @Test
    public void successful() {
        RangeSumQueryImmutable303 rangeSumQueryImmutable303 = new RangeSumQueryImmutable303(new int[]{-2, 0, 3, -5, 2, -1});
        Assertions.assertEquals(1, rangeSumQueryImmutable303.sumRange3(0, 2));
        Assertions.assertEquals(-1, rangeSumQueryImmutable303.sumRange3(2, 5));
        Assertions.assertEquals(-3, rangeSumQueryImmutable303.sumRange3(0, 5));
    }
}

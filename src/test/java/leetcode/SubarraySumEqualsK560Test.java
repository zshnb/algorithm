package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarraySumEqualsK560Test {
    @Test
    public void successful() {
        SubarraySumEqualsK560 obj = new SubarraySumEqualsK560();
        Assertions.assertEquals(3, obj.subarraySum(new int[]{1,-1,0}, 0));
        Assertions.assertEquals(4, obj.subarraySum(new int[]{1,2,1,2,1}, 3));
        Assertions.assertEquals(2, obj.subarraySum(new int[]{1,1,1}, 2));
        Assertions.assertEquals(2, obj.subarraySum(new int[]{1,2,3}, 3));
    }

    @Test
    public void successful2() {
        SubarraySumEqualsK560 obj = new SubarraySumEqualsK560();
        Assertions.assertEquals(3, obj.subarraySum2(new int[]{1,-1,0}, 0));
        Assertions.assertEquals(4, obj.subarraySum2(new int[]{1,2,1,2,1}, 3));
        Assertions.assertEquals(2, obj.subarraySum2(new int[]{1,1,1}, 2));
        Assertions.assertEquals(2, obj.subarraySum2(new int[]{1,2,3}, 3));
    }
}

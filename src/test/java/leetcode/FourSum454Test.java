package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourSum454Test {
    public FourSum454 instance = new FourSum454();

    @Test
    public void test() {
        Assertions.assertEquals(2, instance.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));
    }
}

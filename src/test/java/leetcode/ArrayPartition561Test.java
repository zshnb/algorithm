package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayPartition561Test {
    @Test
    public void successful() {
        ArrayPartition561 arrayPartition561 = new ArrayPartition561();
        Assertions.assertEquals(4, arrayPartition561.arrayPairSum(new int[]{1, 4, 3, 2}));
        Assertions.assertEquals(9, arrayPartition561.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }

    @Test
    public void successful2() {
        ArrayPartition561 arrayPartition561 = new ArrayPartition561();
        Assertions.assertEquals(4, arrayPartition561.arrayPairSum2(new int[]{1, 4, 3, 2}));
        Assertions.assertEquals(9, arrayPartition561.arrayPairSum2(new int[]{6, 2, 6, 5, 1, 2}));
    }
}

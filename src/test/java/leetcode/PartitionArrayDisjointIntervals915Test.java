package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionArrayDisjointIntervals915Test {
    @Test
    public void successful() {
        PartitionArrayDisjointIntervals915 obj = new PartitionArrayDisjointIntervals915();
        Assertions.assertEquals(1, obj.partitionDisjoint(new int[]{26,51,40,58,42,76,30,48,79,91}));
        Assertions.assertEquals(1, obj.partitionDisjoint(new int[]{1,1}));
        Assertions.assertEquals(3, obj.partitionDisjoint(new int[]{5,0,3,8,6}));
        Assertions.assertEquals(4, obj.partitionDisjoint(new int[]{1,1,1,0,6,12}));
    }

    @Test
    public void successful2() {
        PartitionArrayDisjointIntervals915 obj = new PartitionArrayDisjointIntervals915();
        Assertions.assertEquals(1, obj.partitionDisjoint2(new int[]{26,51,40,58,42,76,30,48,79,91}));
        Assertions.assertEquals(1, obj.partitionDisjoint2(new int[]{1,1}));
        Assertions.assertEquals(3, obj.partitionDisjoint2(new int[]{5,0,3,8,6}));
        Assertions.assertEquals(4, obj.partitionDisjoint2(new int[]{1,1,1,0,6,12}));
    }
}

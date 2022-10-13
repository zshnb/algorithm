package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxChunksMakeSorted769Test {
    @Test
    public void successful() {
        MaxChunksMakeSorted769 obj = new MaxChunksMakeSorted769();
        Assertions.assertEquals(1, obj.maxChunksToSorted(new int[]{2,0,1}));
        Assertions.assertEquals(2, obj.maxChunksToSorted(new int[]{0,2,1}));
        Assertions.assertEquals(2, obj.maxChunksToSorted(new int[]{0,1}));
        Assertions.assertEquals(1, obj.maxChunksToSorted(new int[]{1,0}));
        Assertions.assertEquals(4, obj.maxChunksToSorted(new int[]{1,0,2,3,4}));
        Assertions.assertEquals(1, obj.maxChunksToSorted(new int[]{4,3,2,1,0}));
    }
}

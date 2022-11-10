package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CollectFruitsLCP55Test {
    @Test
    public void successful() {
        CollectFruitsLCP55 obj = new CollectFruitsLCP55();
        Assertions.assertEquals(52, obj.getMinimumTime(new int[]{1,3,5,4}, new int[][]{
            {2,4},{3,3},{1,4},{0,3},{3,1},{3,2},{0,4},{2,3},{1,4}
        }, 2));
    }
}

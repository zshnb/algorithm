package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestNumberAtLeastTwiceOfOthers747Test {
    private LargestNumberAtLeastTwiceOfOthers747 instance = new LargestNumberAtLeastTwiceOfOthers747();

    @Test
    public void test() {
        Assertions.assertEquals(-1, instance.dominantIndex(new int[]{0,2,3,0}));
        Assertions.assertEquals(0, instance.dominantIndex(new int[]{1, 0}));
        Assertions.assertEquals(1, instance.dominantIndex(new int[]{0, 1}));
        Assertions.assertEquals(1, instance.dominantIndex(new int[]{3,6,1,0}));
    }
}

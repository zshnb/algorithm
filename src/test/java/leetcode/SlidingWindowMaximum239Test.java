package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindowMaximum239Test {
    @Test
    public void successful() {
        SlidingWindowMaximum239 obj = new SlidingWindowMaximum239();
        Assertions.assertArrayEquals(new int[]{3,3,5,5,6,7}, obj.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
}

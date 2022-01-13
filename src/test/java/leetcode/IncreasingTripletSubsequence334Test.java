package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingTripletSubsequence334Test {

    private IncreasingTripletSubsequence334 instance = new IncreasingTripletSubsequence334();

    @Test
    public void test() {
        Assertions.assertTrue(instance.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
        Assertions.assertTrue(instance.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertFalse(instance.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        Assertions.assertTrue(instance.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}

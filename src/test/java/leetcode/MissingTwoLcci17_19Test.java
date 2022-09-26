package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingTwoLcci17_19Test {
    @Test
    public void successful() {
        MissingTwoLcci17_19 obj = new MissingTwoLcci17_19();
        Assertions.assertArrayEquals(new int[]{2, 3}, obj.missingTwo(new int[]{1}));
        Assertions.assertArrayEquals(new int[]{1, 4}, obj.missingTwo(new int[]{2, 3}));
    }

    @Test
    public void successful2() {
        MissingTwoLcci17_19 obj = new MissingTwoLcci17_19();
        Assertions.assertArrayEquals(new int[]{5, 8}, obj.missingTwo2(new int[]{1, 2, 3, 4, 6, 7, 9, 10}));
        Assertions.assertArrayEquals(new int[]{2, 3}, obj.missingTwo2(new int[]{1}));
        Assertions.assertArrayEquals(new int[]{1, 4}, obj.missingTwo2(new int[]{2, 3}));
        Assertions.assertArrayEquals(new int[]{1, 4}, obj.missingTwo2(new int[]{3, 2}));
    }
}

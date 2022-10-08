package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdvantageShuffle870Test {

    @Test
    public void successful() {
        AdvantageShuffle870 obj = new AdvantageShuffle870();
        Assertions.assertArrayEquals(new int[]{9, 4, 1, 2, 5}, obj.advantageCount(new int[]{9, 1, 2, 4, 5}, new int[]{6, 2, 9, 1, 4}));
        Assertions.assertArrayEquals(new int[]{2, 11, 7, 15}, obj.advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11}));
    }

    @Test
    public void successful2() {
        AdvantageShuffle870 obj = new AdvantageShuffle870();
        Assertions.assertArrayEquals(new int[]{9, 4, 1, 2, 5}, obj.advantageCount2(new int[]{9, 1, 2, 4, 5}, new int[]{6, 2, 9, 1, 4}));
        Assertions.assertArrayEquals(new int[]{2, 11, 7, 15}, obj.advantageCount2(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11}));
    }
}

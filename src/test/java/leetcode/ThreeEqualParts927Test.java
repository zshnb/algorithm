package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeEqualParts927Test {

    @Test
    public void successful() {
        ThreeEqualParts927 obj = new ThreeEqualParts927();
        int[] result = obj.threeEqualParts(new int[]{1, 0, 1, 0, 1});
        Assertions.assertArrayEquals(new int[]{0, 3}, result);
        result = obj.threeEqualParts(new int[]{0, 0, 0, 1, 1, 1});
        Assertions.assertArrayEquals(new int[]{3, 5}, result);
        result = obj.threeEqualParts(new int[]{0, 1, 0, 1, 1});
        Assertions.assertArrayEquals(new int[]{1, 4}, result);
        result = obj.threeEqualParts(new int[]{1, 1, 0, 1, 1});
        Assertions.assertArrayEquals(new int[]{-1, -1}, result);
    }
}

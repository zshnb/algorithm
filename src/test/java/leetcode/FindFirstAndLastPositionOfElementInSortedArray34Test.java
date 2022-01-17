package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArray34Test {
    private FindFirstAndLastPositionOfElementInSortedArray34 instance = new FindFirstAndLastPositionOfElementInSortedArray34();

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{0, 0}, instance.searchRange(new int[]{1, 3}, 1));
        Assertions.assertArrayEquals(new int[]{3, 4}, instance.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}

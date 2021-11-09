package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMinimumInRotatedSortedArray153Test {
    private FindMinimumInRotatedSortedArray153 instance = new FindMinimumInRotatedSortedArray153();

    @Test
    public void test1() {
        Assertions.assertEquals(1, instance.findMin3(new int[]{5, 1, 2, 3, 4}));
        Assertions.assertEquals(1, instance.findMin3(new int[]{3, 1, 2}));
        Assertions.assertEquals(1, instance.findMin3(new int[]{2, 3, 4, 5, 1}));
        Assertions.assertEquals(1, instance.findMin3(new int[]{3, 4, 5, 1, 2}));
        Assertions.assertEquals(1, instance.findMin3(new int[]{1, 2, 3, 4}));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate219Test {
    private ContainsDuplicate219 instance = new ContainsDuplicate219();

    @Test
    public void test() {
        Assertions.assertTrue(instance.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        Assertions.assertTrue(instance.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        Assertions.assertFalse(instance.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}

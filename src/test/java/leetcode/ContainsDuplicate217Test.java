package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate217Test {

    private ContainsDuplicate217 instance = new ContainsDuplicate217();

    @Test
    public void test1() {
        Assertions.assertTrue(instance.containsDuplicate1(new int[]{1, 2, 3, 1}));
        Assertions.assertFalse(instance.containsDuplicate1(new int[]{1, 2, 3, 4}));
        Assertions.assertTrue(instance.containsDuplicate1(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    public void test2() {
        Assertions.assertFalse(instance.containsDuplicate2(new int[]{1,5,-2,-4,0}));
        Assertions.assertTrue(instance.containsDuplicate2(new int[]{1, 2, 3, 1}));
        Assertions.assertFalse(instance.containsDuplicate2(new int[]{1, 2, 3, 4}));
        Assertions.assertTrue(instance.containsDuplicate2(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}

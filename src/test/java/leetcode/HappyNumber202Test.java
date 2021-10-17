package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumber202Test {
    private HappyNumber202 instance = new HappyNumber202();

    @Test
    public void test() {
        Assertions.assertTrue(instance.isHappy(19));
        Assertions.assertFalse(instance.isHappy(2));
    }
}

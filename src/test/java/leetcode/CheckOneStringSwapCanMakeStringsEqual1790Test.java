package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckOneStringSwapCanMakeStringsEqual1790Test {
    @Test
    public void successful() {
        CheckOneStringSwapCanMakeStringsEqual1790 obj = new CheckOneStringSwapCanMakeStringsEqual1790();
        Assertions.assertTrue(obj.areAlmostEqual("bank", "kanb"));
        Assertions.assertFalse(obj.areAlmostEqual("attack", "defend"));
    }
}

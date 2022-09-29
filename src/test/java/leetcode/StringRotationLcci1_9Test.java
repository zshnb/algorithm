package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringRotationLcci1_9Test {
    @Test
    public void successful() {
        StringRotationLcci1_9 obj = new StringRotationLcci1_9();
        Assertions.assertTrue(obj.isFlipedString("waterbottle", "erbottlewat"));
        Assertions.assertFalse(obj.isFlipedString("aa", "aba"));
    }
}

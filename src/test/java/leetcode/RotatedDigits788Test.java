package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotatedDigits788Test {
    @Test
    public void successful() {
        RotatedDigits788 obj = new RotatedDigits788();
        Assertions.assertEquals(4, obj.rotatedDigits(10));
    }
}

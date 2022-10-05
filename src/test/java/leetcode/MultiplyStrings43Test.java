package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyStrings43Test {
    @Test
    public void successful() {
        MultiplyStrings43 obj = new MultiplyStrings43();
        Assertions.assertEquals("998001", obj.multiply("999", "999"));
        Assertions.assertEquals("56088", obj.multiply("123", "456"));
        Assertions.assertEquals("882", obj.multiply("98", "9"));
        Assertions.assertEquals("81", obj.multiply("9", "9"));
    }
}

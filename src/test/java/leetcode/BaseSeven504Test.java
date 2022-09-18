package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseSeven504Test {
    @Test
    public void successful() {
        BaseSeven504 obj = new BaseSeven504();
        Assertions.assertEquals("-10", obj.convertToBase7(-7));
        Assertions.assertEquals("202", obj.convertToBase7(100));
    }
}

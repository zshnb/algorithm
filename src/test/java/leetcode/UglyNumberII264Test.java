package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UglyNumberII264Test {
    private UglyNumberII264 instance = new UglyNumberII264();

    @Test
    public void test() {
        Assertions.assertEquals(12, instance.nthUglyNumber(10));
    }
}

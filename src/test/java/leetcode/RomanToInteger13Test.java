package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToInteger13Test {
    private RomanToInteger13 instance = new RomanToInteger13();

    @Test
    public void test() {
        Assertions.assertEquals(3, instance.romanToInt("III"));
        Assertions.assertEquals(4, instance.romanToInt("IV"));
        Assertions.assertEquals(9, instance.romanToInt("IX"));
        Assertions.assertEquals(58, instance.romanToInt("LVIII"));
        Assertions.assertEquals(1994, instance.romanToInt("MCMXCIV"));
    }
}

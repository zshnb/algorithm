package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersAMostNGivenDigitSet902Test {
    @Test
    public void successful() {
        NumbersAMostNGivenDigitSet902 obj = new NumbersAMostNGivenDigitSet902();
        Assertions.assertEquals(6, obj.atMostNGivenDigitSet(new String[]{"5", "7", "8"}, 59));
        Assertions.assertEquals(1, obj.atMostNGivenDigitSet(new String[]{"3", "5"}, 4));
        Assertions.assertEquals(20, obj.atMostNGivenDigitSet(new String[]{"1","3","5","7"}, 100));
        Assertions.assertEquals(29523, obj.atMostNGivenDigitSet(new String[]{"1","4","9"}, 1000000000));
        Assertions.assertEquals(1, obj.atMostNGivenDigitSet(new String[]{"7"}, 8));
        Assertions.assertEquals(4, obj.atMostNGivenDigitSet(new String[]{"3", "5"}, 40));
    }
}

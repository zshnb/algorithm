package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateMoneyInLeetcodeBank1716Test {
    private CalculateMoneyInLeetcodeBank1716 instance = new CalculateMoneyInLeetcodeBank1716();

    @Test
    public void test() {
//        Assertions.assertEquals(10, instance.totalMoney(4));
//        Assertions.assertEquals(37, instance.totalMoney(10));
        Assertions.assertEquals(96, instance.totalMoney(20));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfSquareNumbers633Test {
    @Test
    public void successful() {
        SumOfSquareNumbers633 obj = new SumOfSquareNumbers633();
        Assertions.assertTrue(obj.judgeSquareSum(1000000));
        Assertions.assertTrue(obj.judgeSquareSum(1));
        Assertions.assertTrue(obj.judgeSquareSum(2));
        Assertions.assertTrue(obj.judgeSquareSum(4));
        Assertions.assertTrue(obj.judgeSquareSum(5));
        Assertions.assertFalse(obj.judgeSquareSum(3));
    }
}

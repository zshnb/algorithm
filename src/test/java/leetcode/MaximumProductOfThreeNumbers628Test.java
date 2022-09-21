package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductOfThreeNumbers628Test {

    @Test
    public void successful() {
        MaximumProductOfThreeNumbers628 obj = new MaximumProductOfThreeNumbers628();
        Assertions.assertEquals(6, obj.maximumProduct(new int[]{-1, -2, 1, 2, 3}));
    }

    @Test
    public void successful2() {
        MaximumProductOfThreeNumbers628 obj = new MaximumProductOfThreeNumbers628();
        Assertions.assertEquals(-6, obj.maximumProduct2(new int[]{-1,-2,-3}));
        Assertions.assertEquals(6, obj.maximumProduct2(new int[]{-1, -2, 1, 2, 3}));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitIntoBaskets904Test {
    @Test
    public void successful() {
        FruitIntoBaskets904 obj = new FruitIntoBaskets904();
        Assertions.assertEquals(5, obj.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
        Assertions.assertEquals(3, obj.totalFruit(new int[]{1,2,1}));
        Assertions.assertEquals(3, obj.totalFruit(new int[]{0,1,2,2}));
        Assertions.assertEquals(4, obj.totalFruit(new int[]{1,2,3,2,2}));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumUnitsTruck1710Test {
    @Test
    public void successful() {
        MaximumUnitsTruck1710 obj = new MaximumUnitsTruck1710();
        Assertions.assertEquals(8, obj.maximumUnits(new int[][]{
            {1,3},
            {2,2},
            {3,1}
        }, 4));
    }
}

package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumClosest16Test {
    @Test
    public void successful() {
        ThreeSumClosest16 obj = new ThreeSumClosest16();
        Assertions.assertEquals(2, obj.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
}

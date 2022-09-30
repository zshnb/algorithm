package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMissingPositive41Test {
    @Test
    public void successful() {
        FirstMissingPositive41 obj = new FirstMissingPositive41();
        Assertions.assertEquals(3, obj.firstMissingPositive(new int[]{1,2,0}));
        Assertions.assertEquals(2, obj.firstMissingPositive(new int[]{3,4,-1,1}));
        Assertions.assertEquals(1, obj.firstMissingPositive(new int[]{7,8,9,11,12}));
    }

    @Test
    public void successful2() {
        FirstMissingPositive41 obj = new FirstMissingPositive41();
        Assertions.assertEquals(1, obj.firstMissingPositive2(new int[]{-1, 1000}));
        Assertions.assertEquals(3, obj.firstMissingPositive2(new int[]{1,2,0}));
        Assertions.assertEquals(2, obj.firstMissingPositive2(new int[]{3,4,-1,1}));
        Assertions.assertEquals(1, obj.firstMissingPositive2(new int[]{7,8,9,11,12}));
        Assertions.assertEquals(1, obj.firstMissingPositive2(new int[]{2}));
    }
}

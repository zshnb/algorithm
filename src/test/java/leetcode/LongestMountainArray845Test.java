package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestMountainArray845Test {
    @Test
    public void successful() {
        LongestMountainArray845 obj = new LongestMountainArray845();
        Assertions.assertEquals(3, obj.longestMountain(new int[]{0,2,0,2,1,2,3,4,4,1}));
        Assertions.assertEquals(5, obj.longestMountain(new int[]{2,1,4,7,3,2,5}));
    }
}

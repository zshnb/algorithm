package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequence300Test {
    @Test
    public void successful() {
        LongestIncreasingSubsequence300 obj = new LongestIncreasingSubsequence300();
        Assertions.assertEquals(3, obj.lengthOfLIS(new int[]{4,10,4,3,8,9}));
        Assertions.assertEquals(4, obj.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}

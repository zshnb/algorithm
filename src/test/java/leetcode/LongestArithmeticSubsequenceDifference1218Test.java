package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestArithmeticSubsequenceDifference1218Test {
    @Test
    public void successful() {
        LongestArithmeticSubsequenceDifference1218 obj = new LongestArithmeticSubsequenceDifference1218();
        Assertions.assertEquals(2, obj.longestSubsequence(new int[]{4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8}, 0));
        Assertions.assertEquals(4, obj.longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1}, -2));
        Assertions.assertEquals(2, obj.longestSubsequence(new int[]{3,0,-3,4,-4,7,6}, 3));
        Assertions.assertEquals(4, obj.longestSubsequence(new int[]{1,2,3,4}, 1));
        Assertions.assertEquals(1, obj.longestSubsequence(new int[]{1,3,5,7}, 1));
    }

    @Test
    public void successful2() {
        LongestArithmeticSubsequenceDifference1218 obj = new LongestArithmeticSubsequenceDifference1218();
        Assertions.assertEquals(2, obj.longestSubsequence2(new int[]{4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8}, 0));
        Assertions.assertEquals(4, obj.longestSubsequence2(new int[]{1,5,7,8,5,3,4,2,1}, -2));
        Assertions.assertEquals(2, obj.longestSubsequence2(new int[]{3,0,-3,4,-4,7,6}, 3));
        Assertions.assertEquals(4, obj.longestSubsequence2(new int[]{1,2,3,4}, 1));
        Assertions.assertEquals(1, obj.longestSubsequence2(new int[]{1,3,5,7}, 1));
    }
}

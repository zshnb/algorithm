package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckBinaryStringHasSegmentOfOnes1784Test {
    @Test
    public void successful() {
        CheckBinaryStringHasSegmentOfOnes1784 obj = new CheckBinaryStringHasSegmentOfOnes1784();
        Assertions.assertTrue(obj.checkOnesSegment("1000"));
        Assertions.assertFalse(obj.checkOnesSegment("1001"));
        Assertions.assertTrue(obj.checkOnesSegment("110"));
    }
}

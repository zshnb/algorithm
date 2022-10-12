package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstring76Test {
    @Test
    public void successful() {
        MinimumWindowSubstring76 obj = new MinimumWindowSubstring76();
        Assertions.assertEquals("BANC", obj.minWindow("ADOBECODEBANC", "ABC"));
    }
}

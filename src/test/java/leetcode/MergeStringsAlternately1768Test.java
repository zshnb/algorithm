package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternately1768Test {
    @Test
    public void successful() {
        MergeStringsAlternately1768 obj = new MergeStringsAlternately1768();
        Assertions.assertEquals("apbqrs", obj.mergeAlternately("ab", "pqrs"));
        Assertions.assertEquals("apbqcr", obj.mergeAlternately("abc", "pqr"));
    }
}

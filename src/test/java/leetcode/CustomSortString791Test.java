package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomSortString791Test {
    @Test
    public void successful() {
        CustomSortString791 obj = new CustomSortString791();
        Assertions.assertEquals("dcba", obj.customSortString("cba", "abcd"));
    }
}

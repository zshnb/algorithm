package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckArrayFormationThroughConcatenation1640Test {
    @Test
    public void successful() {
        CheckArrayFormationThroughConcatenation1640 obj = new CheckArrayFormationThroughConcatenation1640();
        Assertions.assertTrue(obj.canFormArray(new int[]{91,4,64,78}, new int[][]{
            {78},
            {4,64},
            {91}
        }));
        Assertions.assertTrue(obj.canFormArray(new int[]{15,88}, new int[][]{
            {88}, {15}
        }));
        Assertions.assertFalse(obj.canFormArray(new int[]{49,18,16}, new int[][]{
            {16,18,49}
        }));
    }
}

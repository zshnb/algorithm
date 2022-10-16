package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PossiblePartition886Test {
    @Test
    public void successful() {
        PossiblePartition886 obj = new PossiblePartition886();
        Assertions.assertFalse(obj.possibleBipartition(5, new int[][]{
            {1, 2},
            {2, 3},
            {3,4},
            {4,5},
            {1,5}
        }));
        Assertions.assertTrue(obj.possibleBipartition(4, new int[][]{
            {1, 2},
            {1, 3},
            {2,4}
        }));
        Assertions.assertTrue(obj.possibleBipartition(10, new int[][]{
            {4,7},
            {4,8},
            {5,6},
            {1,6},
            {3,7},
            {2,5},
            {5,8},
            {1,2},
            {4,9},
            {6,10},
            {8,10},
            {3,6},
            {2,10},
            {9,10},
            {3,9},
            {2,3},
            {1,9},
            {4,6},
            {5,7},
            {3,8},
            {1,8},
            {1,7},
            {2,4}
        }));
        Assertions.assertTrue(obj.possibleBipartition(1, new int[][]{
        }));
    }
}

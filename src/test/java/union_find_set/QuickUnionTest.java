package union_find_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickUnionTest {
    @Test
    public void unionAndConnected() {
        QuickUnion quickUnion = new QuickUnion(10);
        Assertions.assertFalse(quickUnion.isConnected(1, 2));
        quickUnion.union(1, 2);
        Assertions.assertTrue(quickUnion.isConnected(1, 2));
    }
}

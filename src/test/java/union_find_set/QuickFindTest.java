package union_find_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickFindTest {
    @Test
    public void unionAndConnected() {
        QuickFind quickFind = new QuickFind(10);
        Assertions.assertFalse(quickFind.isConnected(1, 2));
        quickFind.union(1, 2);
        Assertions.assertTrue(quickFind.isConnected(1, 2));
    }
}

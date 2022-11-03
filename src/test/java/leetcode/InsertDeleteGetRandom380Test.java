package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertDeleteGetRandom380Test {
    @Test
    public void successful() {
        InsertDeleteGetRandom380 obj = new InsertDeleteGetRandom380();
        obj.insert(0);
        obj.insert(1);
        obj.remove(0);
        obj.insert(2);
        obj.remove(1);
        Assertions.assertEquals(2, obj.getRandom());

        obj = new InsertDeleteGetRandom380();
        obj.remove(0);
        obj.remove(0);
        obj.insert(0);
        obj.getRandom();
        obj.remove(0);
        Assertions.assertTrue(obj.insert(0));
    }
}

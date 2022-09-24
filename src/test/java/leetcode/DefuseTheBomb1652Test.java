package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefuseTheBomb1652Test{
    @Test
    public void successful() {
        DefuseTheBomb1652 obj = new DefuseTheBomb1652();
        int[] key = obj.decrypt(new int[]{5,7,1,4}, 3);
        Assertions.assertArrayEquals(new int[]{12,10,16,13}, key);

        key = obj.decrypt(new int[]{2,4,9,3}, -2);
        Assertions.assertArrayEquals(new int[]{12,5,6,13}, key);
    }
}

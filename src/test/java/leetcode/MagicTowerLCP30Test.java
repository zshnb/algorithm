package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicTowerLCP30Test {

    private MagicTowerLCP30 instance = new MagicTowerLCP30();

    @Test
    public void test() {
        Assertions.assertEquals(2,
            instance.magicTower(new int[]{-1, -1, 10}));
        Assertions.assertEquals(1,
            instance.magicTower(new int[]{5, -4, 1, -2, -2, -2, 4}));
        Assertions.assertEquals(1,
            instance.magicTower(new int[]{100, 100, 100, -250, -60, -140, -50, -50, 100, 150}));
        Assertions.assertEquals(-1,
            instance.magicTower(new int[]{-200, -300, 400, 0}));
    }
}

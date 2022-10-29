package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DailyTemperatures739Test {
    @Test
    public void successful() {
        DailyTemperatures739 obj = new DailyTemperatures739();
        Assertions.assertArrayEquals(new int[]{8,1,5,4,3,2,1,1,0,0}, obj.dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70}));
        Assertions.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, obj.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
}

package leetcode;

import org.junit.jupiter.api.Test;

public class RandomPickWithBlacklist710Test {
    @Test
    public void successful() {
        RandomPickWithBlacklist710 obj = new RandomPickWithBlacklist710(7, new int[]{2,3,5});
        for (int i = 0; i < 4; i++) {
            System.out.println(obj.pick());
        }
    }
}

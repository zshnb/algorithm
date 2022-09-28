package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetKthMagicNumberLcci17_9Test {
    @Test
    public void successful() {
        GetKthMagicNumberLcci17_9 obj = new GetKthMagicNumberLcci17_9();
        Assertions.assertEquals(9, obj.getKthMagicNumber(5));
        Assertions.assertEquals(3215625, obj.getKthMagicNumber(251));
        Assertions.assertEquals(1937102445, obj.getKthMagicNumber(643));
    }
}

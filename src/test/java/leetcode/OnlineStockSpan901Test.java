package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OnlineStockSpan901Test {
    @Test
    public void successful() {
        OnlineStockSpan901 obj = new OnlineStockSpan901();
        Assertions.assertEquals(1, obj.next(100));
        Assertions.assertEquals(1, obj.next(80));
        Assertions.assertEquals(1, obj.next(60));
        Assertions.assertEquals(2, obj.next(70));
        Assertions.assertEquals(1, obj.next(60));
        Assertions.assertEquals(4, obj.next(75));
        Assertions.assertEquals(6, obj.next(85));
    }

    @Test
    public void successful2() {
        OnlineStockSpan901 obj = new OnlineStockSpan901();
        Assertions.assertEquals(1, obj.next2(100));
        Assertions.assertEquals(1, obj.next2(80));
        Assertions.assertEquals(1, obj.next2(60));
        Assertions.assertEquals(2, obj.next2(70));
        Assertions.assertEquals(1, obj.next2(60));
        Assertions.assertEquals(4, obj.next2(75));
        Assertions.assertEquals(6, obj.next2(85));
    }
}

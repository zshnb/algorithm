package lru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class LRUTest {
    private LRU<String, Integer> lru = new LRU<>(5);

    @Test
    public void testLru() {
        IntStream.range(0, 5).forEach(it -> lru.put(it + "", it));
        lru.put("6", 6);
        Assertions.assertNull(lru.get("0"));
    }
}

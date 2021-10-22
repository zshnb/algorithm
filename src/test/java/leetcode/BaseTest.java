package leetcode;

import org.junit.jupiter.api.Assertions;

import java.util.List;

public class BaseTest {
    <T> void assertListEquals(List<T> expect, List<T> actual) {
        Assertions.assertEquals(expect.size(), actual.size());
        for (int i = 0; i < expect.size(); i++) {
            Assertions.assertEquals(expect.get(i), actual.get(i));
        }
    }
}

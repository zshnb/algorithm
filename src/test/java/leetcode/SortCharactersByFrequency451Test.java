package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortCharactersByFrequency451Test {
    private SortCharactersByFrequency451 instance = new SortCharactersByFrequency451();

    @Test
    public void test1() {
        Assertions.assertEquals("eetr", instance.frequencySort("tree"));
        Assertions.assertEquals("cccaaa", instance.frequencySort("cccaaa"));
        Assertions.assertEquals("bbaA", instance.frequencySort("Aabb"));
    }
}

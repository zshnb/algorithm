package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrequencyOfTheMostFrequentElement1838Test {
    private FrequencyOfTheMostFrequentElement1838 instance = new FrequencyOfTheMostFrequentElement1838();

    @Test
    public void test() {
        Assertions.assertEquals(3, instance.maxFrequency(new int[] {1, 2, 4}, 5));
        Assertions.assertEquals(2, instance.maxFrequency(new int[] {1,4,8,13}, 5));
        Assertions.assertEquals(1, instance.maxFrequency(new int[] {3,9,6}, 2));
    }
}

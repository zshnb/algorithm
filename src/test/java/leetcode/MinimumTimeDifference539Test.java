package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumTimeDifference539Test {
    private MinimumTimeDifference539 instance = new MinimumTimeDifference539();

    @Test
    public void test1() {
        Assertions.assertEquals(260, instance.findMinDifference(new ArrayList<>()
        {{
            add("22:40");
            add("18:20");
            add("12:41");
        }}));
        List<String> strings = new ArrayList<>()
        {{
            add("23:59");
            add("00:00");
        }};
        Assertions.assertEquals(1, instance.findMinDifference(strings));
        Assertions.assertEquals(120, instance.findMinDifference(new ArrayList<>()
        {{
            add("00:00");
            add("04:00");
            add("22:00");
        }}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(260, instance.findMinDifference(new ArrayList<>()
        {{
            add("22:40");
            add("18:20");
            add("12:41");
        }}));
        List<String> strings = new ArrayList<>()
        {{
            add("23:59");
            add("00:00");
        }};
        Assertions.assertEquals(1, instance.findMinDifference(strings));
        Assertions.assertEquals(120, instance.findMinDifference(new ArrayList<>()
        {{
            add("00:00");
            add("04:00");
            add("22:00");
        }}));
    }
}

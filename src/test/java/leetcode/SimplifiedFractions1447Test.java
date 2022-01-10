package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SimplifiedFractions1447Test extends BaseTest {
    private SimplifiedFractions1447 instance = new SimplifiedFractions1447();

    @Test
    public void test() {
        List<String> expect = new ArrayList<>()
        {{
            add("1/2");
        }};
        assertListEquals(expect, instance.simplifiedFractions(2));
        instance.simplifiedFractions(6).forEach(System.out::println);
    }
}

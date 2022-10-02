package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Triangle120Test {
    @Test
    public void successful() {
        Triangle120 obj = new Triangle120();
        Assertions.assertEquals(11, obj.minimumTotal(new ArrayList<>(){{
            add(List.of(2));
            add(Arrays.asList(3, 4));
            add(Arrays.asList(6,5,7));
            add(Arrays.asList(4,1,8,3));
        }}));
        Assertions.assertEquals(-1, obj.minimumTotal(new ArrayList<>(){{
            add(List.of(-1));
            add(Arrays.asList(2,3));
            add(Arrays.asList(1,-1,-3));
        }}));
    }
}

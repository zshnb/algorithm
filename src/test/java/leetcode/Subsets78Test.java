package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Subsets78Test {
    private Subsets78 instance = new Subsets78();

    @Test
    public void test() {
        List<List<Integer>> result = new ArrayList<>();
        Assertions.assertEquals(8, instance.subsets(new int[]{1,2,3}).size());
    }
}

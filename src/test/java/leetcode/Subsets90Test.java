package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Subsets90Test {
    private Subsets90 instance = new Subsets90();

    @Test
    public void test() {
        Assertions.assertEquals(6, instance.subsetsWithDup(new int[]{1,2,2}).size());
    }
}

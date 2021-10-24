package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPosition35Test {
    private SearchInsertPosition35 instance = new SearchInsertPosition35();

    @Test
    public void test1() {
        Assertions.assertEquals(1, instance.searchInsert1(new int[] {1,3,5,6}, 2));
        Assertions.assertEquals(2, instance.searchInsert1(new int[] {1,3,5,6}, 5));
    }

}

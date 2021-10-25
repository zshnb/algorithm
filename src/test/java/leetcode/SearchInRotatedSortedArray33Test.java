package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArray33Test {

    private SearchInRotatedSortedArray33 instance = new SearchInRotatedSortedArray33();

    @Test
    public void test() {
        Assertions.assertEquals(-1, instance.search(new int[]{1, 3}, 0));
        Assertions.assertEquals(4, instance.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}

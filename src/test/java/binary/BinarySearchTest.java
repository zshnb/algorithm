package binary;

import search.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test() {
        int[] nums = new int[] {-3, 2, 4, 8, 12, 45, 67};
        Assertions.assertEquals(4, binarySearch.binarySearch(nums, 12));
        Assertions.assertEquals(0, binarySearch.binarySearch(nums, -3));
        Assertions.assertEquals(2, binarySearch.binarySearch(nums, 4));
        Assertions.assertEquals(-1, binarySearch.binarySearch(nums, 13));
    }
}

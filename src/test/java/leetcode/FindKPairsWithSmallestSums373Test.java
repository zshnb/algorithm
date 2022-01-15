package leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

public class FindKPairsWithSmallestSums373Test {
    private FindKPairsWithSmallestSums373 instance = new FindKPairsWithSmallestSums373();

    @Test
    public void test() {
        instance.kSmallestPairs(new int[]{1,1,2}, new int[]{1,2,3}, 10);
        instance.kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6}, 3);
        instance.kSmallestPairs(new int[]{1,1,2}, new int[]{1,2,3}, 3);
    }
}

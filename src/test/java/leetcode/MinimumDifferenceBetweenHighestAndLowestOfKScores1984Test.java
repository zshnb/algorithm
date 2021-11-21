package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984Test {
    private MinimumDifferenceBetweenHighestAndLowestOfKScores1984 instance = new MinimumDifferenceBetweenHighestAndLowestOfKScores1984();

    @Test
    public void test() {
        Assertions.assertEquals(74560, instance.minimumDifference(new int[]{87063, 61094, 44530, 21297, 95857, 93551, 9918}, 6));
        Assertions.assertEquals(2, instance.minimumDifference(new int[]{9, 4, 1, 7}, 2));
    }
}

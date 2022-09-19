package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IslandPerimeter463Test {
    @Test
    public void successful() {
        IslandPerimeter463 obj = new IslandPerimeter463();
        Assertions.assertEquals(16, obj.islandPerimeter(new int[][]{
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        }));
    }
}

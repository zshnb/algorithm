package leetcode;

/**
 * 思路1：理想情况下周长为格子数量* 4, 如果格子之间相邻，那么周长要减去相邻格子的边2次（因为是2个格子），所以只要遍历二维数组，记下每个格子周围相邻格子的数量，
 * 最后用总格子数* 4 - 相邻格子数量
 * */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int neighborCount = 0;
        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islandCount += 1;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        neighborCount += 1;
                    }
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        neighborCount += 1;
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        neighborCount += 1;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        neighborCount += 1;
                    }
                }
            }
        }
        return 4 * islandCount - neighborCount;
    }
}

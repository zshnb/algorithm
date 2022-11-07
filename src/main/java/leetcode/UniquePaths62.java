package leetcode;

/**
 * 思路1：动态规划，走到某格子的次数等于上方格子次数+前方格子次数，最上面一行和最左边一行次数为1
 * */
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int[][] dpTable = new int[m][n];
        for (int i = 0; i < dpTable.length; i++) {
            for (int j = 0; j < dpTable[i].length; j++) {
                if (i == 0) {
                    dpTable[i][j] = 1;
                } else if (j == 0) {
                    dpTable[i][j] = 1;
                }
                else {
                    dpTable[i][j] = dpTable[i][j-1] + dpTable[i-1][j];
                }
            }
        }
        return dpTable[m-1][n-1];
    }
}

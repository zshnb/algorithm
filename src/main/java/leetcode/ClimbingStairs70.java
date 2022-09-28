package leetcode;

/**
 * 思路1：动态规划，到第n个台阶的走法=第n-1个台阶走法（跨一步）+第n-2个台阶走法（跨两步）
 * */
public class ClimbingStairs70 {
    public int climbStairs(int n) {
        int[] stars = new int[1000];
        stars[0] = 1;
        stars[1] = 1;
        for (int i = 2; i < n; i++) {
            stars[i] = stars[i - 1] + stars[i - 2];
        }
        return stars[n];
    }
}

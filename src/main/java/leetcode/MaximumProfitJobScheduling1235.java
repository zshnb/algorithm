package leetcode;

import java.util.Arrays;

/**
 * 思路1：动态规划，首先对工作按照结束时间排序，然后定义dpTable，表示当前工作下最大利润，如果当前工作与前一个工作无法同时进行，二选一最大的，
 * 否则把当前工作利润+前面找到的最大工作利润和前一个工作最大利润取最大值。
 * */
public class MaximumProfitJobScheduling1235 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Work[] works = new Work[endTime.length];
        for (int i = 0; i < works.length; i++)
            works[i] = new Work(startTime[i], endTime[i], profit[i]);
        Arrays.sort(works);
        int[] dp = new int[works.length + 1];
        dp[0] = 0; // 初始第一个虚拟的dp，报酬为0
        for (int i = 1; i <= works.length; i++) {
            int pre = 0;
            for (int j = i - 1; j >= 0; j--) {
                // 向前寻找“最近的”“已完成的"兼职工作
                if (works[j].endTime <= works[i-1].startTime) {
                    pre = j + 1; break;
                }
            }
            dp[i] = Math.max(dp[i - 1], dp[pre] + works[i-1].profit);
        }
        return dp[works.length];
    }
    /** 兼职工作实体类 */
    static class Work implements Comparable<Work> {
        public int startTime, endTime, profit;
        public Work(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
        public int compareTo(Work other) {
            return Integer.compare(this.endTime, other.endTime);
        }
    }
}

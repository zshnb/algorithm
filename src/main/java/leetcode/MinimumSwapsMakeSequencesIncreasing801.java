package leetcode;

/**
 * 思路1：动态规划，根据题目描述，我们可以采用动态规划进行题解。首先，构建一个dp[i][j]，其中：
 *
 *     i：表示所在nums1和nums2的位置index；
 *     j：只有两类值，0表示不交换；1表示交换；
 *     【综上所述】
 *     dp[i][0] 表示在nums1[i]和nums2[i]位置处，如果不交换位置的话，当前累积的操作次数。
 *     dp[i][1] 表示在nums1[i]和nums2[i]位置处，如果交换位置的话，当前累积的操作次数。
 *
 * 首先，我们来初始化第1个位置，如果不进行交换，那么累积操作次数等于0，即：dp[0][0]=0；如果进行交换，那么累积操作次数等于1，即：dp[0][1]=1；
 *
 * 将视角仅关注于数组nums1和nums2中每两个元素的对比，即：nums1[i - 1]、nums1[i]、nums2[i - 1]、nums2[i]，如果nums1和nums2前后2个元素
 * 严格递增，那么这2个位置可以换也可以不换，如果nums1[i] > nums2[i-1]，nums2[i] > nums1[i-1]，那么当前位置和前面位置只能选择一个交换
 * */
public class MinimumSwapsMakeSequencesIncreasing801 {
    public int minSwap(int[] nums1, int[] nums2) {
        int[][] dpTable = new int[nums1.length][2];
        dpTable[0][1] = 1;
        for (int i = 1; i < dpTable.length; i++) {
            dpTable[i][0] = nums1.length + 1;
            dpTable[i][1] = nums1.length + 1;
        }

        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] > nums1[i-1] && nums2[i] > nums2[i-1]) {
                dpTable[i][0] = dpTable[i-1][0];
                dpTable[i][1] = dpTable[i-1][1] + 1;
            }
            if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                dpTable[i][0] = Math.min(dpTable[i][0], dpTable[i-1][1]);
                dpTable[i][1] = Math.min(dpTable[i][1], dpTable[i-1][0] + 1);
            }
        }
        return Math.min(dpTable[dpTable.length - 1][0], dpTable[dpTable.length - 1][1]);
    }
}

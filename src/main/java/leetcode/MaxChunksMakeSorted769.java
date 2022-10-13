package leetcode;

/**
 * 思路1：题目限制了数组的数和下标是对应的，因此当一个区间内的最大数等于当前遍历时的下标，则遇到一个需要切分排序的区间
 * */
public class MaxChunksMakeSorted769 {
    public int maxChunksToSorted(int[] arr) {
        int max = -1;

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (i == max) {
                result += 1;
            }
        }
        return result;
    }
}

package leetcode;

/**
 * 思路：按照题意顺序计算即可
 * */
public class CollectFruitsLCP55 {
    public int getMinimumTime(int[] time, int[][] fruits, int limit) {
        int result = 0;
        for (int[] fruit : fruits) {
            int type = fruit[0];
            int num = fruit[1];
            int relateTime = time[type];
            if (num < limit) {
                result += relateTime;
            } else {
                result += relateTime * (Math.ceil(num * 1.0 / limit));
            }
        }
        return result;
    }
}

package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 思路1：首先判断数组有无解（和小于0无解），开始遍历数组，将当前血量与当前数组值相加，同时数组值小于0的元素加入队列，
 * 如果当前血量相加后的结果小于0，将队列头出队后，血量回复相应数，同时操作数+1
 * 总结就是把扣血的数字从大到小放入优先队列，当当前血量不足时恢复扣血最大的数，相当于把那个房间放到末尾
 * */
public class MagicTowerLCP30 {
    public int magicTower(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        long blood = 1;
        int res = 0;
        if (Arrays.stream(nums).sum() < 0) return -1;
        for (int num : nums) {
            if (num < 0) {
                queue.add(num);
            }
            blood += num;
            if (blood <= 0) {
                blood -= queue.remove();
                res += 1;
            }
        }
        return res;
    }
}

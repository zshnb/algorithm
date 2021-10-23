package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 思路1：把数组转set，判断set长度与数组长度是否一致，不一致说明有重复元素<br>
 * 思路2：使用freq数组记录每个数字出现的频率，这里要用2个freq数组，分别记录正数和负数，在判断的时候也要分别判断正数的频率和负数
 * 的频率
 * */
public class ContainsDuplicate217 {
    public boolean containsDuplicate1(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() != nums.length;
    }

    public boolean containsDuplicate2(int[] nums) {
        int[] freq = new int[100000];
        int[] negative = new int[100000];
        for (int num : nums) {
            if (num < 0) {
                negative[-num]++;
            } else {
                freq[num]++;
            }
            if ((num >= 0 && freq[num] > 1) || (num < 0 && negative[-num] > 1)) {
                return true;
            }
        }
        return false;
    }
}

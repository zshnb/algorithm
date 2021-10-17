package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 思路1：使用freq记录第一个数组每个元素出现次数，遍历第二个数组，如果数组元素在freq数组中数量>0，将当前元素加入结果，freq元素数量减一<br>
 * 思路2：使用map代替freq
 * */
public class IntersectionOfTwoArrays350 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[128];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            freq[nums1[i]]++;
        }
        for (int i = 0;i < nums2.length;i++) {
            if (freq[nums2[i]] > 0) {
                res.add(nums2[i]);
                freq[nums2[i]]--;
            }
        }
        int[] nums = new int[res.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res.get(i);
        }
        return nums;
    }
}

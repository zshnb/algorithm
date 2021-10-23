package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用map记录元素对应下标，遍历数组，判断当前元素是否存在map中，若不存在则将元素和下标放入map，若存在，取出下标（因为存在，说明
 * 是之前遇到的放入的），判断当前下标减去map中的下标是否大于k，如果大于，不符合要求，覆盖下标
 * */
public class ContainsDuplicate219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (i - index <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

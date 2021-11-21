package leetcode;

import java.util.*;

/**
 * 思路1：递归回溯，选择当前元素，递归选择，然后不选择当前元素，这里为了去重，需要先将数组排序
 * */
public class Subsets90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> items = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        result.add(new ArrayList<>());
        recursive(0, nums, result, items, set);
        return result;
    }

    private void recursive(int i, int[] nums, List<List<Integer>> result, List<Integer> items, Set<List<Integer>> set) {
        if (i >= nums.length) return;
        items.add(nums[i]);
        if (!set.contains((new ArrayList<>(items)))) {
            result.add(new ArrayList<>(items));
            set.add(new ArrayList<>(items));
        }
        recursive(i + 1, nums, result, items, set); // 选择当前元素
        items.remove(items.size() - 1);
        recursive(i + 1, nums, result, items, set); // 不选当前元素
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：递归回溯，选择当前元素，递归选择，然后不选择当前元素
 * */
public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> items = new ArrayList<>();
        result.add(new ArrayList<>());
        recursive(0, nums, result, items);
        return result;
    }

    private void recursive(int i, int[] nums, List<List<Integer>> result, List<Integer> items) {
        if (i >= nums.length) return;
        items.add(nums[i]);
        result.add(new ArrayList<>(items));
        recursive(i + 1, nums, result, items); // 选择当前元素
        items.remove(items.size() - 1);
        recursive(i + 1, nums, result, items); // 不选当前元素
    }
}

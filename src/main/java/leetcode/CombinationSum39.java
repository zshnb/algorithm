package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 思路1：先排序，然后回溯，遇到大于剩下数时剪枝，当剩下的数为0时将路径加入结果
 * */
public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        recursive(result, path, target, candidates, 0);
        return result;
    }

    private void recursive(List<List<Integer>> result, List<Integer> path, int target, int[] candidates, int begin) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                return;
            }
            path.add(candidates[i]);
            recursive(result, path, target - candidates[i], candidates, i + 1);
            path.remove(path.size() - 1);
        }
    }
}

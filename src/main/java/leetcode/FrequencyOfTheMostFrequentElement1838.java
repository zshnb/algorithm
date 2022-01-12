package leetcode;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < nums.length - 1) {
            if ((right - left + 1) * (nums[right + 1] - nums[right]) <= k) {
                k -= (right - left + 1) * (nums[right + 1] - nums[right]);
                for (int i = left;i <= right;i++) {
                    nums[i] = nums[right + 1];
                }
                res = Math.max(res, right - left + 1) + 1;
                right += 1;
            } else {
                left += 1;
                right = left;
            }
        }
        return res == 0 ? 1 : res;
    }
}

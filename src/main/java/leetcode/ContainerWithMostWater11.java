package leetcode;

/**
 * 思路1：双指针，从头尾向中间移动，在移动过程中作为容器的底总是会减一，因此想让容积变大要从高度考虑，所以判断左右哪边当前的高度低，让低的一边移动
 * */
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int volume = (r - l) * Math.min(height[r], height[l]);
            if (volume > max) {
                max = volume;
            }
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}

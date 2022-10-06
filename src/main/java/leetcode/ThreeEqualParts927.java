package leetcode;

import java.util.Arrays;

/**
 * 思路1：要想三等分数组，数组和必须为3的整数倍，不满足直接返回-1。定义i，j，k，分别表示三个子数组的区间，把数组和除以3,可以得到三个子数组区间内
 * 1的个数，于是i=从数组头开始遇到的第一个1，j=i开始数，直到数过的1等于区间内1的个数为止，同理k=j开始数。然后三指针同时前进，判断当前指向的数是否相等
 * 最后判断k是否到末尾，到了则说明有解。
 * */
public class ThreeEqualParts927 {

    public int[] threeEqualParts(int[] arr) {
        int[] result = new int[]{-1, -1};
        int i = 0, j = 2;
        int sum = Arrays.stream(arr).sum();
        if (sum == 0) {
            return new int[]{0, 2};
        }
        if (sum % 3 != 0) {
            return result;
        }
        while (arr[i] != 1) {
            i += 1;
        }
        j = i;
        int count = sum / 3;
        while (count != 0) {
            j += 1;
            if (arr[j] == 1) {
                count -= 1;
            }
        }
        count = sum / 3;
        int k = j;
        while (count != 0) {
            k += 1;
            if (arr[k] == 1) {
                count -= 1;
            }
        }
        while (k < arr.length && arr[i] == arr[j] && arr[j] == arr[k]) {
            i += 1;
            j += 1;
            k += 1;
        }
        return k == arr.length ? new int[]{i - 1, j} : result;
    }
}

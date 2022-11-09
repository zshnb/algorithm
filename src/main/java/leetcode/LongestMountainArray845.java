package leetcode;

/**
 * 思路1：首先找到某个山峰，即比左右元素都大的元素，然后从该元素开始向左向右遍历，直到无法满足条件为止，遍历过程中记录长度，当一个山峰遍历完，更新最大值
 * */
public class LongestMountainArray845 {
    public int longestMountain(int[] arr) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i + 1]) {
                for (int j = i;j > 0;j--) {
                    if (arr[j] > arr[j-1]) {
                        currentLength += 1;
                    } else {
                        break;
                    }
                }
                for (int j = i;j < arr.length - 1;j++) {
                    if (arr[j] > arr[j + 1]) {
                        currentLength += 1;
                    } else {
                        break;
                    }
                }
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        return maxLength == 0 ? maxLength : maxLength + 1;
    }
}

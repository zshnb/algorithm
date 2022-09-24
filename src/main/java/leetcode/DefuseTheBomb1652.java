package leetcode;

import java.util.Arrays;

/**
 * 思路1：无论是从前往后还是从后往前循环，都是把数组分成两部分，用从前往后举例子，就是从当前元素的下一个一直加到结尾，作为和的一部分，然后再从头开始
 * 一直加到(k - 前面加过的元素个数)处，作为最后的和
 * */
public class DefuseTheBomb1652 {
    public int[] decrypt(int[] code, int k) {
        int[] key = new int[code.length];
        if (k == 0) {
            Arrays.fill(code, 0);
        } else if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                if (i + k < code.length) {
                    for (int j = i + 1;j < i + k + 1;j++) {
                        sum += code[j];
                    }
                } else {
                    for (int j = i + 1;j < code.length;j++) {
                        sum += code[j];
                    }
                    for (int j = 0;j < k - (code.length - (i + 1));j++) {
                        sum += code[j];
                    }
                }
                key[i] = sum;
            }
        } else {
            int k2 = Math.abs(k);
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                if (i - k2 >= 0) {
                    for (int j = i - 1;j > (i - 1) - k2;j--) {
                        sum += code[j];
                    }
                } else {
                    for (int j = i - 1;j >= 0;j--) {
                        sum += code[j];
                    }
                    for (int j = code.length - 1;j >= code.length - (k2 - i);j--) {
                        // i = 0 index 3,2
                        // i = 1 index 3
                        sum += code[j];
                    }
                }
                key[i] = sum;
            }
        }

        return key;
    }
}

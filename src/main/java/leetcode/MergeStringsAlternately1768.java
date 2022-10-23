package leetcode;

/**
 * 思路1：使用单指针同时指向2个字符串，并且按顺序添加字符，直到某个字符串用完，把剩下字符串部分全部加到末尾
 * 思路2：使用双指针完成上面的逻辑
 * */
public class MergeStringsAlternately1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int index = 0;
        char[] result = new char[word1.length() + word2.length()];
        int resultIndex = 0;

        while (index < chars1.length && index < chars2.length) {
            result[resultIndex] = chars1[index];
            resultIndex += 1;
            result[resultIndex] = chars2[index];
            resultIndex += 1;
            index += 1;
        }

        if (index < chars2.length) {
            for (int i = index; i < chars2.length; i++) {
                result[resultIndex] = chars2[i];
                resultIndex += 1;
            }
        } else if (index < chars1.length) {
            for (int i = index; i < chars1.length; i++) {
                result[resultIndex] = chars1[i];
                resultIndex += 1;
            }
        }
        return new String(result);
    }
}

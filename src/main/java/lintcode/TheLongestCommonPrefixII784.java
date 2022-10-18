package lintcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 思路1：比较给定字符串列表中每个字符串当前索引字符与target当前索引字符是否相等，迭代过程中移除当前字符不相等的字符串，遍历完如果列表还有元素，更新最大值
 * */
public class TheLongestCommonPrefixII784 {
    public int theLongestCommonPrefix(List<String> dic, String target) {
        List<String> tempStrings = new ArrayList<>(dic);
        int i = 0;
        int result = 0;
        while (!tempStrings.isEmpty()) {
            char targetCh = target.charAt(i);
            Iterator<String> iterator = tempStrings.iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (i >= string.length()) {
                    iterator.remove();
                    break;
                }
                char firstCh = string.charAt(i);
                if (firstCh != targetCh) {
                    iterator.remove();
                }
            }
            if (tempStrings.isEmpty()) {
                break;
            }
            i += 1;
            result = Math.max(result, i);
        }
        return result;
    }
}

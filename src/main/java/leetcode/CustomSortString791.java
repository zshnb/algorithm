package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 思路1：首先遍历order，使用map记下每个字符与下标，然后遍历s，如果s字符不再map中，直接加入结果字符串中，否则把字符放入栈中，入栈时需要维护栈中字符顺序为order中从大到小，
 * 最后把栈中数据倒序拼接到结果字符串中
 * 思路2：计数排序，我们首先遍历字符串s，使用数组或哈希表统计每个字符出现的次数。随后遍历字符串 order中的每个字符c，如果其在s中出现了k次，就在答案的末尾添加k个c，
 * 并将数组或哈希表中对应的次数置为0。最后我们遍历一次哈希表，对于所有次数k 非0的键值对(c,k)，在答案的末尾添加k个c即可。
 * */
public class CustomSortString791 {
    public String customSortString(String order, String s) {
        char[] orderChars = order.toCharArray();
        Map<Character, Integer> charWithIndex = new HashMap<>();
        for (int i = 0; i < orderChars.length; i++) {
            charWithIndex.put(orderChars[i], i);
        }

        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder tempStr = new StringBuilder("");

        char[] chs = s.toCharArray();
        for (char ch : chs) {
            if (charWithIndex.containsKey(ch)) {
                if (deque.isEmpty()) {
                    deque.addFirst(ch);
                } else {
                    int nowIndex = charWithIndex.get(ch);
                    List<Character> characters = new ArrayList<>();
                    while (!deque.isEmpty() && nowIndex < charWithIndex.get(deque.getFirst())) {
                        char top = deque.removeFirst();
                        characters.add(top);
                    }
                    deque.addFirst(ch);
                    for (int i = characters.size() - 1; i >= 0; i--) {
                        deque.addFirst(characters.get(i));
                    }
                }
            } else {
                tempStr.append(ch);
            }
        }

        while (!deque.isEmpty()) {
            tempStr.append(deque.removeLast());
        }
        return tempStr.toString();
    }

    public String customSortString2(String order, String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            ++freq[ch - 'a'];
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < order.length(); ++i) {
            char ch = order.charAt(i);
            while (freq[ch - 'a'] > 0) {
                ans.append(ch);
                freq[ch - 'a']--;
            }
        }
        for (int i = 0; i < 26; ++i) {
            while (freq[i] > 0) {
                ans.append((char) (i + 'a'));
                freq[i]--;
            }
        }
        return ans.toString();
    }
}

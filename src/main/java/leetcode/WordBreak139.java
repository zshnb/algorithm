package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 思路1：动态规划，dpTable[i]表示s[0..i]的子字符串是否可以被拼接，因此需要遍历s的全部子字符串，外层循环控制s的字符索引，内层循环控制0到外层循环，
 * 内层循环判断当前下标子字符串存在字典（即dpTable对应下标值=true），且后面子字符串也存在字典，则把dpTable对应下标值=true，表示当前下标前子字符串可以
 * 用字典拼接而成
 * */
public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dpTable = new boolean[s.length() + 1];
        dpTable[0] = true;// 填充左边界，空字符串为true
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dpTable[j] && wordDictSet.contains(s.substring(j, i))) {
                    dpTable[i] = true;
                    break;
                }
            }
        }
        return dpTable[s.length()];
    }
}

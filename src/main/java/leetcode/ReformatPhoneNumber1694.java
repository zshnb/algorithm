package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：首先替换非数字字符，然后按照3个一组分割字符串，剩下的再做一次分割
 * 思路2：同样去除原字符串所有非数字，然后循环新字符串，按照3个字符一组把字符加入结果字符串，剩下的4个做最后分组
 * */
public class ReformatPhoneNumber1694 {
    public String reformatNumber(String number) {
        String replacedNumber = number.replaceAll("[\\s-]", "");
        List<String> firstStringBlocks = new ArrayList<>();
        List<String> secondStringBlocks = new ArrayList<>();
        int i;
        for (i = 0; i < replacedNumber.length(); i += 3) {
            if (replacedNumber.length() - i > 4) {
                firstStringBlocks.add(replacedNumber.substring(i, i + 3));
            } else {
                break;
            }
        }
        if (replacedNumber.length() - i <= 3) {
            secondStringBlocks.add(replacedNumber.substring(i));
        } else {
            secondStringBlocks.add(replacedNumber.substring(i, i + 2));
            i += 2;
            secondStringBlocks.add(replacedNumber.substring(i, i + 2));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String firstStringBlock : firstStringBlocks) {
            stringBuilder.append(firstStringBlock);
            stringBuilder.append("-");
        }
        if (secondStringBlocks.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        } else {
            for (int i1 = 0; i1 < secondStringBlocks.size(); i1++) {
                stringBuilder.append(secondStringBlocks.get(i1));
                if (i1 != secondStringBlocks.size() - 1) {
                    stringBuilder.append("-");
                }
            }
        }
        return stringBuilder.toString();
    }
    public String reformatNumber2(String number) {
        StringBuilder replacedNumber = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (!(c + "").equals(" ") && !(c + "").equals("-")) {
                replacedNumber.append(c);
            }
        }
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        char[] chars = replacedNumber.toString().toCharArray();
        while (i < chars.length) {
            if (chars.length - i > 4 || stringBuilder.length() != 0) {
                stringBuilder.append(chars[i]);
            }
            if (stringBuilder.length() == 3) {
                result.append(stringBuilder);
                result.append("-");
                stringBuilder = new StringBuilder();
            } else if (stringBuilder.length() == 0 &&  chars.length - i <= 3) {
                for (int j = i; j < chars.length; j++) {
                    result.append(chars[j]);
                }
                break;
            } else if (stringBuilder.length() == 0 && chars.length - i <= 4) {
                for (int j = i; j < chars.length; j++) {
                    result.append(chars[j]);
                }
                result.insert(result.length() - 2, '-');
                break;
            }
            i += 1;
        }
        if (result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}

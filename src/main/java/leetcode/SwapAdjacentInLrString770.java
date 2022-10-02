package leetcode;

/**
 * 思路1：两个字符串去掉所有的X，题目中的替换即L字符只能往左移动，R字符只能往右移动，因此要想能转换，必须满足start中所有的L都要大于等于end中的L,
 * 同理R要小于等于R
 * */
public class SwapAdjacentInLrString770 {

    public boolean canTransform(String start, String end) {
        char[] startArray = start.toCharArray(), endArray = end.toCharArray();
        int j = 0, length = start.length();
        for (int i = 0; i < length; i++) {
            if (startArray[i] == 'X') continue;
            for (; j < length; j++) {
                if (endArray[j] != 'X') break;
            }
            if (j == length || startArray[i] != endArray[j]) return false;
            if (startArray[i] == 'L' && i < j) return false;// 'L'只能往左走
            if (startArray[i] == 'R' && i > j) return false;// 'R'只能往右走
            j++;
        }
        for (;j < length; j++)
            if (endArray[j] != 'X') return false;
        return true;
    }
}

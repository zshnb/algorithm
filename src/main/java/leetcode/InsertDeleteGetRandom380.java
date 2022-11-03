package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 思路1：获取元素O(1)，必须通过数组获取，要想插入和删除为O(1)，必须都在数组的末尾操作，在删除中间元素时，可以把中间元素放在数组末尾，然后删除，所以需要map记录数组元素和对应下标
 * */
public class InsertDeleteGetRandom380 {
    private Map<Integer, Integer> valWithIndex = new HashMap<>();
    private List<Integer> array = new ArrayList<>();
    public InsertDeleteGetRandom380() {

    }

    public boolean insert(int val) {
        if (valWithIndex.containsKey(val)) {
            return false;
        }
        array.add(val);
        valWithIndex.put(val, array.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        int lastIndex = array.size() - 1;
        if (valWithIndex.containsKey(val)) {
            int index = valWithIndex.get(val);
            if (index == array.size() - 1) {
                valWithIndex.remove(val);
                array.remove(lastIndex);
                return true;
            }
            int temp = array.get(index);
            array.set(index, array.get(lastIndex));
            array.set(lastIndex, temp);
            array.remove(lastIndex);
            valWithIndex.remove(val);
            if (!array.isEmpty()) {
                valWithIndex.put(array.get(index), index);
            }
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int i = new Random().nextInt(array.size()) % array.size();
        return array.get(i);
    }
}

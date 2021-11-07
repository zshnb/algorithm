package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 初始化的时候将嵌套列表扁平化，遇到数字加入额外列表，遇到列表递归处理
 * */
class NestedIterator341 implements Iterator<Integer> {
    private List<Integer> integers;
    private Iterator<Integer> iterator;
    public NestedIterator341(List<NestedInteger> nestedList) {
        integers = new ArrayList<>();
        processList(nestedList);
        iterator = integers.iterator();
    }

    private void processList(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                integers.add(nestedInteger.getInteger());
            } else {
                processList(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
package lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRU<K, V> {
    private LinkedList<K> keys;
    private Map<K, V> map;
    private int size;

    public LRU(int size) {
        this.size = size;
        keys = new LinkedList<>();
        map = new HashMap<>(size);
    }

    public void put(K key, V val) {
        if (isFull()) {
            K lastKey = keys.pollLast();
            map.remove(lastKey);
        }
        if (map.containsKey(key)) {
            keys.remove(key);
        }
        keys.addFirst(key);
        map.put(key, val);
    }

    public V get(K key) {
        keys.remove(key);
        keys.addFirst(key);
        return map.get(key);
    }

    private boolean isFull() {
        return size == map.size();
    }
}

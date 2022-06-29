package com.futurecollars.lesson13.task4;

import java.util.Map;

public class Pair<K, V> {

    Map<K, V> map;

    public Pair(Map<K, V> map) {
        this.map = map;
    }

    public V getValue(K key) {
        return (map.get(key));
    }

    public K getKey(V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V mapValue = entry.getValue();
            if (mapValue.equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

}

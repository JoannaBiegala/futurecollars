package com.futurecollars.lesson13.task1;

import static java.util.Objects.hash;

public class OwnHashMap<K,V> implements OwnMap{

    int size;

    public OwnHashMap(int size) {
        this.size = 0;
    }

    @Override
    public boolean put(String key, String value) {
        Node node = new Node(hash(key), key, value);
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        return this.key == key;
    }

    @Override
    public boolean containsValue(Object value) {
        return this.value == value;
    }

    @Override
    public String remove(String key) {
        String value = get(key);
        return value;
    }

    @Override
    public String get(String key) {
        return null;
    }

}

package com.futurecollars.lesson13.task1;

public class OwnHashMap implements OwnMap {
    private final int capacity = 10;
    public Entry[] buckets;

    public OwnHashMap() {
        buckets = new Entry[capacity];
    }


    private int hashing(int hashcode) {
        return hashcode % capacity;
    }

    @Override
    public boolean put(String key, String value) {
        if (key == null) {
            throw new IllegalArgumentException("Key can't be null.");
        }
        int location = hashing(key.hashCode());
        buckets[location] = new Entry(key, value);
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        for (Entry entry : buckets) {
            if (entry != null && entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Entry entry : buckets) {
            if (entry != null && value.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        for (Entry entry : buckets) {
            if (entry != null && entry.getKey().equals(key)) {
                String value = entry.getValue();
                entry.setValue(null);
                entry.setKey(null);
                return value;
            }
        }
        return "There is no entry for the given key " + key;
    }

    @Override
    public String get(String key) {
        for (Entry entry : buckets) {
            if (entry != null && key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "There is no entry for the given key " + key;
    }

}

package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static Pair<Object, Object> swap(Pair<Object, Object> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(value, key);
    }
}

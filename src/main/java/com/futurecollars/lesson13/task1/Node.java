package com.futurecollars.lesson13.task1;

import java.util.Objects;

public class Node<K,V> {
    final int hash;
    String key;
    String value;
   Node<K,V> next;
    public Node(int hash, String key, String value) {
        this.hash = hash;
        this.key = key;
        this.value = value;
    //    this.next = next;

    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }




}

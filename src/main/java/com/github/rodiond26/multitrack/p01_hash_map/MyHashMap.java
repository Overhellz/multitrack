package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.Objects;

class MyHashMap {

    private int n;
    private MyLinkedList[] buckets;

    public MyHashMap() {
        this.n = 991; // some large enough prime number
        this.buckets = new MyLinkedList[this.n];
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new MyLinkedList();
        }
        buckets[index].put(key, value);
    }

    public int get(int key) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new MyLinkedList();
        }
        return buckets[index].get(key);
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new MyLinkedList();
        }
        buckets[index].remove(key);
    }

    private int hash(int x) {
        return Objects.hash(x) % this.n;
    }
}

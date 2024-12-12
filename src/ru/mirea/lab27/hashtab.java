package ru.mirea.lab27;

import java.util.Hashtable;

public class hashtab<K, V> {
    private Hashtable<K, V> table;

    public hashtab() {
        hashtabInit();
    }

    public V hashtabHash(K key) {
        return table.getOrDefault(key, null);
    }

    private void hashtabInit() {
        table = new Hashtable<K, V>();
    }

    public void hashtabAdd(K key, V value) {
        table.put(key, value);
    }

    public boolean hashtabLookup(K key) {
        return table.containsKey(key);
    }

    public void hashtabDelete(K key) {
        if (!hashtabLookup(key)) return;
        table.remove(key);
    }

    public static void main(String[] args) {
        hashtab<String, Integer> tab = new hashtab<>();
        tab.hashtabAdd("a", 1);
        tab.hashtabAdd("b", 2);
        tab.hashtabAdd("c", 3);
        tab.hashtabAdd("d", 4);
        tab.hashtabAdd("e", 5);
        System.out.println(tab.hashtabHash("c"));
        tab.hashtabDelete("c");
        System.out.println(tab.hashtabHash("c"));
    }
}

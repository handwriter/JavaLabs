package ru.mirea.lab28;

import java.util.Hashtable;

public class hashtab {
    private Hashtable<String, Float> table;

    public hashtab() {
        hashtabInit();
    }

    public Float hashtabHash(String key) {
        return table.getOrDefault(key, null);
    }

    private void hashtabInit() {
        table = new Hashtable<String, Float>();
    }

    public void hashtabAdd(String key, int value) {
        table.put(key, 0.616161f * (float) value % (table.size() + 1));
    }

    public boolean hashtabLookup(String key) {
        return table.containsKey(key);
    }

    public void hashtabDelete(String key) {
        if (!hashtabLookup(key)) return;
        table.remove(key);
    }
}

package com.taeroen.cache;

import com.taeroen.cache.AbstractCacheManager;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleCacheManager<K, V> extends AbstractCacheManager<K, V> {
    private Map<K, V> storage;

    public SimpleCacheManager() {
        storage = new ConcurrentHashMap<K, V>();
    }

    @Override
    public V fetch(K k) {
        return storage.get(k);
    }

    @Override
    public void add(K k, V v) {
        storage.put(k,v);
    }
}

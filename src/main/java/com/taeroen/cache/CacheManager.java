package com.taeroen.cache;

import java.util.HashMap;

public interface CacheManager<K, V> {
    public V fetch(K k);

    public void add(K k, V v);
}

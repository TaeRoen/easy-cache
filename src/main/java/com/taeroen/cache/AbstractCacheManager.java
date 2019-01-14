package com.taeroen.cache;

public abstract class AbstractCacheManager<K, V> implements CacheManager<K, V> {
    private int maxSize;
    private int currentSize;

}

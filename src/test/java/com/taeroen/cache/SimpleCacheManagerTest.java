package com.taeroen.cache;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleCacheManagerTest {
    @Test
    public void fetchTest() {
        SimpleCacheManager<String, String> cacheManager = new SimpleCacheManager<>();
        String key = "key";
        String cache = "cache object";
        cacheManager.add(key, cache);
        assertSame(cache, cacheManager.fetch(key));
    }
}

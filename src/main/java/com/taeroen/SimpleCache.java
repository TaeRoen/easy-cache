package com.taeroen;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleCache {
    private Map<String, Object> map;

    public SimpleCache() {
        this.map = new ConcurrentHashMap<String, Object>();
    }

    public Object get(String key) {
        return map.get(key);
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }
}

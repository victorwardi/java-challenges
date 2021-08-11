package com.company;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class    ConcurrentMapChallenge {

    public static void main(String[] args) {
        final ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
        cache.put("111", Double.valueOf(5));
        cache.putIfAbsent("111", "LOL");
        cache.put("111", Integer.valueOf(4));
        cache.put("222", Integer.valueOf(4));

        System.out.println(cache);

        //{111=4, 222=4}
    }
}

package com.dch.hashMap;

import java.util.HashMap;

public class HashMapKey {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(null, null);
        System.out.println(map.get(null));
    }
}

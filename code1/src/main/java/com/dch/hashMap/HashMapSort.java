package com.dch.hashMap;

import com.dch.entity.User;

import java.util.*;

/**
 * HashMap 排序
 */
public class HashMapSort {
    public static void main(String[] args) {
        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User("tom", 25));
        map.put(3, new User("jery", 22));
        map.put(2, new User("jack", 28));
        System.out.println("原始:" + map);
        
        //调用排序方法
        map = sortHashMap(map);
        System.out.println("排序后:" + map);
    }

    private static Map<Integer, User> sortHashMap(Map<Integer, User> map) {
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();
        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        });

        LinkedHashMap<Integer, User> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, User> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
        }

        return map1;
    }
}

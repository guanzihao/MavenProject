package com.maven.app.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        map.put("d", 2);
        map.put("c", 1);
        map.put("b", 1);
        map.put("a", 3);
        System.out.println(map.keySet());
        Map<String, Integer> map1 = new HashMap<String, Integer>();

        map1.put("d", 2);
        map1.put("c", 1);
        map1.put("b", 1);
        map1.put("a", 3);

        System.out.println(map1.keySet());
    }
}

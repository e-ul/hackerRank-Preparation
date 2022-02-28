package com.hackerrank.week2;

import java.util.*;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < a.size() ; i++) {
            hm.put(a.get(i), hm.getOrDefault(a.get(i), 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entrySet =  hm.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static int lonelyInteger_v2(List<Integer> a) {

        Set<Integer> set = new HashSet<>();

        for(Integer i : a) {
            if(set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.iterator().next();
    }
}

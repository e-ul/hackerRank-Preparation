package com.hackerrank.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> matchCntList = new ArrayList<>();

        // String 비교는 equals를 써야함
        for(int i = 0 ; i < queries.size() ; i++) {
            int cnt = 0;
            for(int j = 0 ; j < strings.size() ; j++) {
                if(strings.get(j).equals(queries.get(i))) {
                    cnt++;
                }
            }
            matchCntList.add(cnt);
        }

        return matchCntList;
    }

    public static List<Integer> matchingStrings_v2(List<String> strings, List<String> queries) {
        int[] matchCnt = new int[queries.size()];

        // String 비교는 equals를 써야함
        for(int i = 0 ; i < queries.size() ; i++) {
            for(int j = 0 ; j < strings.size() ; j++) {
                if(strings.get(j).equals(queries.get(i))) {
                    matchCnt[i]++;
                }
            }
        }

        return Arrays.asList(Arrays.stream(matchCnt).boxed().toArray(Integer[]::new));
    }

}

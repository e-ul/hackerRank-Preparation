package com.hackerrank.week1;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minCnt = 0;
        int maxCnt = 0;

        // 0번에는 max 갱신횟수, 1번에는 min 갱신횟수 적어서 return
        for(int i = 1 ; i < scores.size(); i++){
            if(scores.get(i) < min) {
                min = scores.get(i);
                minCnt++;
            } else if(scores.get(i) > max) {
                max = scores.get(i);
                maxCnt++;
            }
        }

        return Arrays.asList(maxCnt, minCnt);
    }

}

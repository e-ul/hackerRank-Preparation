package com.hackerrank.week1;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        int pCnt = 0;
        int nCnt = 0;
        int zCnt = 0;

        for (int i = 0 ; i < arr.size() ; i++) {
            if (arr.get(i) < 0){
                nCnt++;
            } else if (arr.get(i) > 0){
                pCnt++;
            } else {
                zCnt++;
            }
        }
        System.out.println(String.format("%.6f", (float) pCnt / arr.size()));
        System.out.println(String.format("%.6f", (float) nCnt / arr.size()));
        System.out.println(String.format("%.6f", (float) zCnt / arr.size()));
    }

}
